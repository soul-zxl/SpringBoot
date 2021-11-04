package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzSchedulerStateEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_scheduler_state", schema = "demo", catalog = "")
@IdClass(QrtzSchedulerStateEntityPK.class)
public class QrtzSchedulerStateEntity {
    private String schedName;
    private String instanceName;
    private long lastCheckinTime;
    private long checkinInterval;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "instance_name")
    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    @Basic
    @Column(name = "last_checkin_time")
    public long getLastCheckinTime() {
        return lastCheckinTime;
    }

    public void setLastCheckinTime(long lastCheckinTime) {
        this.lastCheckinTime = lastCheckinTime;
    }

    @Basic
    @Column(name = "checkin_interval")
    public long getCheckinInterval() {
        return checkinInterval;
    }

    public void setCheckinInterval(long checkinInterval) {
        this.checkinInterval = checkinInterval;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzSchedulerStateEntity that = (QrtzSchedulerStateEntity) o;
        return lastCheckinTime == that.lastCheckinTime && checkinInterval == that.checkinInterval && Objects.equals(schedName, that.schedName) && Objects.equals(instanceName, that.instanceName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, instanceName, lastCheckinTime, checkinInterval);
    }
}
