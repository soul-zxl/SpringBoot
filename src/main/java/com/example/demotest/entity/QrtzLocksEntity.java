package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzLocksEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_locks", schema = "demo", catalog = "")
@IdClass(QrtzLocksEntityPK.class)
public class QrtzLocksEntity {
    private String schedName;
    private String lockName;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "lock_name")
    public String getLockName() {
        return lockName;
    }

    public void setLockName(String lockName) {
        this.lockName = lockName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzLocksEntity that = (QrtzLocksEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(lockName, that.lockName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, lockName);
    }
}
