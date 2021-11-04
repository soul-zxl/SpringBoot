package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzCronTriggersEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_cron_triggers", schema = "demo", catalog = "")
@IdClass(QrtzCronTriggersEntityPK.class)
public class QrtzCronTriggersEntity {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String cronExpression;
    private String timeZoneId;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "trigger_name")
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Id
    @Column(name = "trigger_group")
    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Basic
    @Column(name = "cron_expression")
    public String getCronExpression() {
        return cronExpression;
    }

    public void setCronExpression(String cronExpression) {
        this.cronExpression = cronExpression;
    }

    @Basic
    @Column(name = "time_zone_id")
    public String getTimeZoneId() {
        return timeZoneId;
    }

    public void setTimeZoneId(String timeZoneId) {
        this.timeZoneId = timeZoneId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzCronTriggersEntity that = (QrtzCronTriggersEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup) && Objects.equals(cronExpression, that.cronExpression) && Objects.equals(timeZoneId, that.timeZoneId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, triggerName, triggerGroup, cronExpression, timeZoneId);
    }
}
