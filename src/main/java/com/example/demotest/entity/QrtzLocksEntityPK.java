package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzLocksEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzLocksEntityPK implements Serializable {
    private String schedName;
    private String lockName;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Column(name = "lock_name")
    @Id
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
        QrtzLocksEntityPK that = (QrtzLocksEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(lockName, that.lockName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, lockName);
    }
}
