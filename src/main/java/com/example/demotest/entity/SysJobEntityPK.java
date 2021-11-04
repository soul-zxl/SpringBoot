package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: SysJobEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
public class SysJobEntityPK implements Serializable {
    private long jobId;
    private String jobName;
    private String jobGroup;

    @Column(name = "job_id")
    @Id
    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    @Column(name = "job_name")
    @Id
    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    @Column(name = "job_group")
    @Id
    public String getJobGroup() {
        return jobGroup;
    }

    public void setJobGroup(String jobGroup) {
        this.jobGroup = jobGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysJobEntityPK that = (SysJobEntityPK) o;
        return jobId == that.jobId && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, jobName, jobGroup);
    }
}
