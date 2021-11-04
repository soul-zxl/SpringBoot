package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: SysRoleDeptEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
public class SysRoleDeptEntityPK implements Serializable {
    private long roleId;
    private long deptId;

    @Column(name = "role_id")
    @Id
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "dept_id")
    @Id
    public long getDeptId() {
        return deptId;
    }

    public void setDeptId(long deptId) {
        this.deptId = deptId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleDeptEntityPK that = (SysRoleDeptEntityPK) o;
        return roleId == that.roleId && deptId == that.deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, deptId);
    }
}
