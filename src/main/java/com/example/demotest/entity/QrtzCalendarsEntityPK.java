package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzCalendarsEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzCalendarsEntityPK implements Serializable {
    private String schedName;
    private String calendarName;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Column(name = "calendar_name")
    @Id
    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzCalendarsEntityPK that = (QrtzCalendarsEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(calendarName, that.calendarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, calendarName);
    }
}
