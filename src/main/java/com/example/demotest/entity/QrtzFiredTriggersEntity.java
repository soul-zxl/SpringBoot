package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzFiredTriggersEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_fired_triggers", schema = "demo", catalog = "")
@IdClass(QrtzFiredTriggersEntityPK.class)
public class QrtzFiredTriggersEntity {
    private String schedName;
    private String entryId;
    private String triggerName;
    private String triggerGroup;
    private String instanceName;
    private long firedTime;
    private long schedTime;
    private int priority;
    private String state;
    private String jobName;
    private String jobGroup;
    private String isNonconcurrent;
    private String requestsRecovery;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "entry_id")
    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    @Basic
    @Column(name = "trigger_name")
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Basic
    @Column(name = "trigger_group")
    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Basic
    @Column(name = "instance_name")
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Basic
    @Column(name = "fired_time")
    public long getFiredTime() {
        return firedTime;
    }

    public void setFiredTime(long firedTime) {
        this.firedTime = firedTime;
    }

    @Basic
    @Column(name = "sched_time")
    public long getSchedTime() {
        return schedTime;
    }

    public void setSchedTime(long schedTime) {
        this.schedTime = schedTime;
    }

    @Basic
    @Column(name = "priority")
    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "job_name")
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Basic
    @Column(name = "job_group")
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Basic
    @Column(name = "is_nonconcurrent")
    public String getIsNonconcurrent() {
        return isNonconcurrent;
    }

    public void setIsNonconcurrent(String isNonconcurrent) {
        this.isNonconcurrent = isNonconcurrent;
    }

    @Basic
    @Column(name = "requests_recovery")
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzFiredTriggersEntity that = (QrtzFiredTriggersEntity) o;
        return firedTime == that.firedTime && schedTime == that.schedTime && priority == that.priority && Objects.equals(schedName, that.schedName) && Objects.equals(entryId, that.entryId) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup) && Objects.equals(instanceName, that.instanceName) && Objects.equals(state, that.state) && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup) && Objects.equals(isNonconcurrent, that.isNonconcurrent) && Objects.equals(requestsRecovery, that.requestsRecovery);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, entryId, triggerName, triggerGroup, instanceName, firedTime, schedTime, priority, state, jobName, jobGroup, isNonconcurrent, requestsRecovery);
    }
}
