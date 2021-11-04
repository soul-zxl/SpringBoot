package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QrtzPausedTriggerGrpsEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "qrtz_paused_trigger_grps", schema = "demo", catalog = "")
@IdClass(QrtzPausedTriggerGrpsEntityPK.class)
public class QrtzPausedTriggerGrpsEntity {
    private String schedName;
    private String triggerGroup;

    @Id
    @Column(name = "sched_name")
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Id
    @Column(name = "trigger_group")
    public String getTriggerGroup() {
        return triggerGroup;
    }

    public void setTriggerGroup(String triggerGroup) {
        this.triggerGroup = triggerGroup;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QrtzPausedTriggerGrpsEntity that = (QrtzPausedTriggerGrpsEntity) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(triggerGroup, that.triggerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, triggerGroup);
    }
}
