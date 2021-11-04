package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName: QrtzCalendarsEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_calendars", schema = "demo", catalog = "")
@IdClass(QrtzCalendarsEntityPK.class)
public class QrtzCalendarsEntity {
    private String schedName;
    private String calendarName;
    private byte[] calendar;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "calendar_name")
    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    @Basic
    @Column(name = "calendar")
    public byte[] getCalendar() {
        return calendar;
    }

    public void setCalendar(byte[] calendar) {
        this.calendar = calendar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzCalendarsEntity that = (QrtzCalendarsEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(calendarName, that.calendarName) && Arrays.equals(calendar, that.calendar);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(schedName, calendarName);
        result = 31 * result + Arrays.hashCode(calendar);
        return result;
    }
}
