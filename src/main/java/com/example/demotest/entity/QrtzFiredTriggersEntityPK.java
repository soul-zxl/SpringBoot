package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzFiredTriggersEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzFiredTriggersEntityPK implements Serializable {
    private String schedName;
    private String entryId;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Column(name = "entry_id")
    @Id
    public String getEntryId() {
        return entryId;
    }

    public void setEntryId(String entryId) {
        this.entryId = entryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzFiredTriggersEntityPK that = (QrtzFiredTriggersEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(entryId, that.entryId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, entryId);
    }
}
