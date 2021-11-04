package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysMenuEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_menu", schema = "demo", catalog = "")
public class SysMenuEntity {
    private long menuId;
    private String menuName;
    private Long parentId;
    private Integer orderNum;
    private String url;
    private String target;
    private String menuType;
    private String visible;
    private String isRefresh;
    private String perms;
    private String icon;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "menu_id")
    public long getMenuId() {
        return menuId;
    }

    public void setMenuId(long menuId) {
        this.menuId = menuId;
    }

    @Basic
    @Column(name = "menu_name")
    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    @Basic
    @Column(name = "parent_id")
    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    @Basic
    @Column(name = "order_num")
    public Integer getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(Integer orderNum) {
        this.orderNum = orderNum;
    }

    @Basic
    @Column(name = "url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Basic
    @Column(name = "target")
    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    @Basic
    @Column(name = "menu_type")
    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    @Basic
    @Column(name = "visible")
    public String getVisible() {
        return visible;
    }

    public void setVisible(String visible) {
        this.visible = visible;
    }

    @Basic
    @Column(name = "is_refresh")
    public String getIsRefresh() {
        return isRefresh;
    }

    public void setIsRefresh(String isRefresh) {
        this.isRefresh = isRefresh;
    }

    @Basic
    @Column(name = "perms")
    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms;
    }

    @Basic
    @Column(name = "icon")
    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "create_time")
    public Timestamp getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    @Basic
    @Column(name = "update_by")
    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    @Basic
    @Column(name = "update_time")
    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysMenuEntity that = (SysMenuEntity) o;
        return menuId == that.menuId && Objects.equals(menuName, that.menuName) && Objects.equals(parentId, that.parentId) && Objects.equals(orderNum, that.orderNum) && Objects.equals(url, that.url) && Objects.equals(target, that.target) && Objects.equals(menuType, that.menuType) && Objects.equals(visible, that.visible) && Objects.equals(isRefresh, that.isRefresh) && Objects.equals(perms, that.perms) && Objects.equals(icon, that.icon) && Objects.equals(createBy, that.createBy) && Objects.equals(createTime, that.createTime) && Objects.equals(updateBy, that.updateBy) && Objects.equals(updateTime, that.updateTime) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(menuId, menuName, parentId, orderNum, url, target, menuType, visible, isRefresh, perms, icon, createBy, createTime, updateBy, updateTime, remark);
    }
}
