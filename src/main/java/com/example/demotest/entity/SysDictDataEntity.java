package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysDictDataEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_dict_data", schema = "demo", catalog = "")
public class SysDictDataEntity {
    private long dictCode;
    private Integer dictSort;
    private String dictLabel;
    private String dictValue;
    private String dictType;
    private String cssClass;
    private String listClass;
    private String isDefault;
    private String status;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "dict_code")
    public long getDictCode() {
        return dictCode;
    }

    public void setDictCode(long dictCode) {
        this.dictCode = dictCode;
    }

    @Basic
    @Column(name = "dict_sort")
    public Integer getDictSort() {
        return dictSort;
    }

    public void setDictSort(Integer dictSort) {
        this.dictSort = dictSort;
    }

    @Basic
    @Column(name = "dict_label")
    public String getDictLabel() {
        return dictLabel;
    }

    public void setDictLabel(String dictLabel) {
        this.dictLabel = dictLabel;
    }

    @Basic
    @Column(name = "dict_value")
    public String getDictValue() {
        return dictValue;
    }

    public void setDictValue(String dictValue) {
        this.dictValue = dictValue;
    }

    @Basic
    @Column(name = "dict_type")
    public String getDictType() {
        return dictType;
    }

    public void setDictType(String dictType) {
        this.dictType = dictType;
    }

    @Basic
    @Column(name = "css_class")
    public String getCssClass() {
        return cssClass;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    @Basic
    @Column(name = "list_class")
    public String getListClass() {
        return listClass;
    }

    public void setListClass(String listClass) {
        this.listClass = listClass;
    }

    @Basic
    @Column(name = "is_default")
    public String getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(String isDefault) {
        this.isDefault = isDefault;
    }

    @Basic
    @Column(name = "status")
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
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
        SysDictDataEntity that = (SysDictDataEntity) o;
        return dictCode == that.dictCode && Objects.equals(dictSort, that.dictSort) && Objects.equals(dictLabel, that.dictLabel) && Objects.equals(dictValue, that.dictValue) && Objects.equals(dictType, that.dictType) && Objects.equals(cssClass, that.cssClass) && Objects.equals(listClass, that.listClass) && Objects.equals(isDefault, that.isDefault) && Objects.equals(status, that.status) && Objects.equals(createBy, that.createBy) && Objects.equals(createTime, that.createTime) && Objects.equals(updateBy, that.updateBy) && Objects.equals(updateTime, that.updateTime) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dictCode, dictSort, dictLabel, dictValue, dictType, cssClass, listClass, isDefault, status, createBy, createTime, updateBy, updateTime, remark);
    }
}
