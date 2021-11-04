package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzSimpleTriggersEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_simple_triggers", schema = "demo", catalog = "")
@IdClass(QrtzSimpleTriggersEntityPK.class)
public class QrtzSimpleTriggersEntity {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private long repeatCount;
    private long repeatInterval;
    private long timesTriggered;

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
    @Column(name = "repeat_count")
    public long getRepeatCount() {
        return repeatCount;
    }

    public void setRepeatCount(long repeatCount) {
        this.repeatCount = repeatCount;
    }

    @Basic
    @Column(name = "repeat_interval")
    public long getRepeatInterval() {
        return repeatInterval;
    }

    public void setRepeatInterval(long repeatInterval) {
        this.repeatInterval = repeatInterval;
    }

    @Basic
    @Column(name = "times_triggered")
    public long getTimesTriggered() {
        return timesTriggered;
    }

    public void setTimesTriggered(long timesTriggered) {
        this.timesTriggered = timesTriggered;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzSimpleTriggersEntity that = (QrtzSimpleTriggersEntity) o;
        return repeatCount == that.repeatCount && repeatInterval == that.repeatInterval && timesTriggered == that.timesTriggered && Objects.equals(schedName, that.schedName) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, triggerName, triggerGroup, repeatCount, repeatInterval, timesTriggered);
    }
}
