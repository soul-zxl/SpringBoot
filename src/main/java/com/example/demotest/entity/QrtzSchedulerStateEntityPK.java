package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzSchedulerStateEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzSchedulerStateEntityPK implements Serializable {
    private String schedName;
    private String instanceName;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Column(name = "instance_name")
    @Id
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzSchedulerStateEntityPK that = (QrtzSchedulerStateEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(instanceName, that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, instanceName);
    }
}
