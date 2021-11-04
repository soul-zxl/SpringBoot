package com.example.demotest.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

/**
 * @ClassName: SysRoleMenuEntityPK
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
public class SysRoleMenuEntityPK implements Serializable {
    private long roleId;
    private long menuId;

    @Column(name = "role_id")
    @Id
    public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    @Column(name = "menu_id")
    @Id
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysRoleMenuEntityPK that = (SysRoleMenuEntityPK) o;
        return roleId == that.roleId && menuId == that.menuId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(roleId, menuId);
    }
}
