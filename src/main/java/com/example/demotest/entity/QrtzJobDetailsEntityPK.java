package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzJobDetailsEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzJobDetailsEntityPK implements Serializable {
    private String schedName;
    private String jobName;
    private String jobGroup;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
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
        QrtzJobDetailsEntityPK that = (QrtzJobDetailsEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(jobName, that.jobName) && Objects.equals(jobGroup, that.jobGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, jobName, jobGroup);
    }
}
