package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Objects;

/**
 * @ClassName: QrtzBlobTriggersEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_blob_triggers", schema = "demo", catalog = "")
@IdClass(QrtzBlobTriggersEntityPK.class)
public class QrtzBlobTriggersEntity {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private byte[] blobData;

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
    @Column(name = "blob_data")
    public byte[] getBlobData() {
        return blobData;
    }

    public void setBlobData(byte[] blobData) {
        this.blobData = blobData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzBlobTriggersEntity that = (QrtzBlobTriggersEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup) && Arrays.equals(blobData, that.blobData);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(schedName, triggerName, triggerGroup);
        result = 31 * result + Arrays.hashCode(blobData);
        return result;
    }
}
