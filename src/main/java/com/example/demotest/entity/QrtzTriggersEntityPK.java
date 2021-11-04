package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: QrtzTriggersEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
public class QrtzTriggersEntityPK implements Serializable {
    private String schedName;
    private String triggerName;
    private String triggerGroup;

    @Column(name = "sched_name")
    @Id
    public String getSchedName() {
        return schedName;
    }

    public void setSchedName(String schedName) {
        this.schedName = schedName;
    }

    @Column(name = "trigger_name")
    @Id
    public String getTriggerName() {
        return triggerName;
    }

    public void setTriggerName(String triggerName) {
        this.triggerName = triggerName;
    }

    @Column(name = "trigger_group")
    @Id
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
        QrtzTriggersEntityPK that = (QrtzTriggersEntityPK) o;
        return Objects.equals(schedName, that.schedName) && Objects.equals(triggerName, that.triggerName) && Objects.equals(triggerGroup, that.triggerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schedName, triggerName, triggerGroup);
    }
}
