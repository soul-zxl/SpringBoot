package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysJobLogEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_job_log", schema = "demo", catalog = "")
public class SysJobLogEntity {
    private long jobLogId;
    private String jobName;
    private String jobGroup;
    private String invokeTarget;
    private String jobMessage;
    private String status;
    private String exceptionInfo;
    private Timestamp createTime;

    @Id
    @Column(name = "job_log_id")
    public long getJobLogId() {
        return jobLogId;
    }

    public void setJobLogId(long jobLogId) {
        this.jobLogId = jobLogId;
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
    @Column(name = "invoke_target")
    public String getInvokeTarget() {
        return invokeTarget;
    }

    public void setInvokeTarget(String invokeTarget) {
        this.invokeTarget = invokeTarget;
    }

    @Basic
    @Column(name = "job_message")
    public String getJobMessage() {
        return jobMessage;
    }

    public void setJobMessage(String jobMessage) {
        this.jobMessage = jobMessage;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "exception_info")
    public String getExceptionInfo() {
        return exceptionInfo;
    }

    public void setExceptionInfo(String exceptionInfo) {
        this.exceptionInfo = exceptionInfo;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysJobLogEntity that = (SysJobLogEntity) o;
        return jobLogId == that.jobLogId && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup) && Objects.equals(invokeTarget, that.invokeTarget) && Objects.equals(jobMessage, that.jobMessage) && Objects.equals(status, that.status) && Objects.equals(exceptionInfo, that.exceptionInfo) && Objects.equals(createTime, that.createTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobLogId, jobName, jobGroup, invokeTarget, jobMessage, status, exceptionInfo, createTime);
    }
}
