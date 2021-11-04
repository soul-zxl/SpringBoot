package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName: QrtzTriggersEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_triggers", schema = "demo", catalog = "")
@IdClass(QrtzTriggersEntityPK.class)
public class QrtzTriggersEntity {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String jobName;
    private String jobGroup;
    private String description;
    private Long nextFireTime;
    private Long prevFireTime;
    private Integer priority;
    private String triggerState;
    private String triggerType;
    private long startTime;
    private Long endTime;
    private String calendarName;
    private Short misfireInstr;
    private byte[] jobData;

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
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "next_fire_time")
    public Long getNextFireTime() {
        return nextFireTime;
    }

    public void setNextFireTime(Long nextFireTime) {
        this.nextFireTime = nextFireTime;
    }

    @Basic
    @Column(name = "prev_fire_time")
    public Long getPrevFireTime() {
        return prevFireTime;
    }

    public void setPrevFireTime(Long prevFireTime) {
        this.prevFireTime = prevFireTime;
    }

    @Basic
    @Column(name = "priority")
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Basic
    @Column(name = "trigger_state")
    public String getTriggerState() {
        return triggerState;
    }

    public void setTriggerState(String triggerState) {
        this.triggerState = triggerState;
    }

    @Basic
    @Column(name = "trigger_type")
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    @Basic
    @Column(name = "start_time")
    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    @Basic
    @Column(name = "end_time")
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    @Basic
    @Column(name = "calendar_name")
    public String getCalendarName() {
        return calendarName;
    }

    public void setCalendarName(String calendarName) {
        this.calendarName = calendarName;
    }

    @Basic
    @Column(name = "misfire_instr")
    public Short getMisfireInstr() {
        return misfireInstr;
    }

    public void setMisfireInstr(Short misfireInstr) {
        this.misfireInstr = misfireInstr;
    }

    @Basic
    @Column(name = "job_data")
    public byte[] getJobData() {
        return jobData;
    }

    public void setJobData(byte[] jobData) {
        this.jobData = jobData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzTriggersEntity that = (QrtzTriggersEntity) o;
        return startTime == that.startTime && Objects.equals(schedName, that.schedName) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup) && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup) && Objects.equals(description, that.description) && Objects.equals(nextFireTime, that.nextFireTime) && Objects.equals(prevFireTime, that.prevFireTime) && Objects.equals(priority, that.priority) && Objects.equals(triggerState, that.triggerState) && Objects.equals(triggerType, that.triggerType) && Objects.equals(endTime, that.endTime) && Objects.equals(calendarName, that.calendarName) && Objects.equals(misfireInstr, that.misfireInstr) && Arrays.equals(jobData, that.jobData);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(schedName, triggerName, triggerGroup, jobName, jobGroup, description, nextFireTime, prevFireTime, priority, triggerState, triggerType, startTime, endTime, calendarName, misfireInstr);
        result = 31 * result + Arrays.hashCode(jobData);
        return result;
    }
}
