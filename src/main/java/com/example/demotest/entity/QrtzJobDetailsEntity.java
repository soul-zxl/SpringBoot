package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName: QrtzJobDetailsEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_job_details", schema = "demo", catalog = "")
@IdClass(QrtzJobDetailsEntityPK.class)
public class QrtzJobDetailsEntity {
    private String schedName;
    private String jobName;
    private String jobGroup;
    private String description;
    private String jobClassName;
    private String isDurable;
    private String isNonconcurrent;
    private String isUpdateData;
    private String requestsRecovery;
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
    @Column(name = "job_name")
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Id
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
    @Column(name = "job_class_name")
    public String getJobClassName() {
        return jobClassName;
    }

    public void setJobClassName(String jobClassName) {
        this.jobClassName = jobClassName;
    }

    @Basic
    @Column(name = "is_durable")
    public String getIsDurable() {
        return isDurable;
    }

    public void setIsDurable(String isDurable) {
        this.isDurable = isDurable;
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
    @Column(name = "is_update_data")
    public String getIsUpdateData() {
        return isUpdateData;
    }

    public void setIsUpdateData(String isUpdateData) {
        this.isUpdateData = isUpdateData;
    }

    @Basic
    @Column(name = "requests_recovery")
    public String getRequestsRecovery() {
        return requestsRecovery;
    }

    public void setRequestsRecovery(String requestsRecovery) {
        this.requestsRecovery = requestsRecovery;
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
        QrtzJobDetailsEntity that = (QrtzJobDetailsEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup) && Objects.equals(description, that.description) && Objects.equals(jobClassName, that.jobClassName) && Objects.equals(isDurable, that.isDurable) && Objects.equals(isNonconcurrent, that.isNonconcurrent) && Objects.equals(isUpdateData, that.isUpdateData) && Objects.equals(requestsRecovery, that.requestsRecovery) && Arrays.equals(jobData, that.jobData);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(schedName, jobName, jobGroup, description, jobClassName, isDurable, isNonconcurrent, isUpdateData, requestsRecovery);
        result = 31 * result + Arrays.hashCode(jobData);
        return result;
    }
}
