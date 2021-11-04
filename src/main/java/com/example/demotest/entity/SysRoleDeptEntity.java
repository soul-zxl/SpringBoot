package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: SysRoleDeptEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_role_dept", schema = "demo", catalog = "")
@IdClass(SysRoleDeptEntityPK.class)
public class SysRoleDeptEntity {
    private long roleId;
    private long deptId;

    @Id
    @Column(name = "role_id")
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Id
    @Column(name = "dept_id")
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
        SysRoleDeptEntity that = (SysRoleDeptEntity) o;
        return roleId == that.roleId && deptId == that.deptId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, deptId);
    }
}
