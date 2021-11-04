package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: SysUserRoleEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
public class SysUserRoleEntityPK implements Serializable {
    private long userId;
    private long roleId;

    @Column(name = "user_id")
    @Id
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Column(name = "role_id")
    @Id
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserRoleEntityPK that = (SysUserRoleEntityPK) o;
        return userId == that.userId && roleId == that.roleId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, roleId);
    }
}
