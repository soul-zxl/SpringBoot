package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: GenTableEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "gen_table", schema = "demo", catalog = "")
public class GenTableEntity {
    private long tableId;
    private String tableName;
    private String tableComment;
    private String subTableName;
    private String subTableFkName;
    private String className;
    private String tplCategory;
    private String packageName;
    private String moduleName;
    private String businessName;
    private String functionName;
    private String functionAuthor;
    private String genType;
    private String genPath;
    private String options;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;
    private String remark;

    @Id
    @Column(name = "table_id")
    public long getTableId() {
        return tableId;
    }

    public void setTableId(long tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "table_name")
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    @Basic
    @Column(name = "table_comment")
    public String getTableComment() {
        return tableComment;
    }

    public void setTableComment(String tableComment) {
        this.tableComment = tableComment;
    }

    @Basic
    @Column(name = "sub_table_name")
    public String getSubTableName() {
        return subTableName;
    }

    public void setSubTableName(String subTableName) {
        this.subTableName = subTableName;
    }

    @Basic
    @Column(name = "sub_table_fk_name")
    public String getSubTableFkName() {
        return subTableFkName;
    }

    public void setSubTableFkName(String subTableFkName) {
        this.subTableFkName = subTableFkName;
    }

    @Basic
    @Column(name = "class_name")
    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Basic
    @Column(name = "tpl_category")
    public String getTplCategory() {
        return tplCategory;
    }

    public void setTplCategory(String tplCategory) {
        this.tplCategory = tplCategory;
    }

    @Basic
    @Column(name = "package_name")
    public String getPackageName() {
        return packageName;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    @Basic
    @Column(name = "module_name")
    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

    @Basic
    @Column(name = "business_name")
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    @Basic
    @Column(name = "function_name")
    public String getFunctionName() {
        return functionName;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    @Basic
    @Column(name = "function_author")
    public String getFunctionAuthor() {
        return functionAuthor;
    }

    public void setFunctionAuthor(String functionAuthor) {
        this.functionAuthor = functionAuthor;
    }

    @Basic
    @Column(name = "gen_type")
    public String getGenType() {
        return genType;
    }

    public void setGenType(String genType) {
        this.genType = genType;
    }

    @Basic
    @Column(name = "gen_path")
    public String getGenPath() {
        return genPath;
    }

    public void setGenPath(String genPath) {
        this.genPath = genPath;
    }

    @Basic
    @Column(name = "options")
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
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
        GenTableEntity that = (GenTableEntity) o;
        return tableId == that.tableId && Objects.equals(tableName, that.tableName) && Objects.equals(tableComment, that.tableComment) && Objects.equals(subTableName, that.subTableName) && Objects.equals(subTableFkName, that.subTableFkName) && Objects.equals(className, that.className) && Objects.equals(tplCategory, that.tplCategory) && Objects.equals(packageName, that.packageName) && Objects.equals(moduleName, that.moduleName) && Objects.equals(businessName, that.businessName) && Objects.equals(functionName, that.functionName) && Objects.equals(functionAuthor, that.functionAuthor) && Objects.equals(genType, that.genType) && Objects.equals(genPath, that.genPath) && Objects.equals(options, that.options) && Objects.equals(createBy, that.createBy) && Objects.equals(createTime, that.createTime) && Objects.equals(updateBy, that.updateBy) && Objects.equals(updateTime, that.updateTime) && Objects.equals(remark, that.remark);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableId, tableName, tableComment, subTableName, subTableFkName, className, tplCategory, packageName, moduleName, businessName, functionName, functionAuthor, genType, genPath, options, createBy, createTime, updateBy, updateTime, remark);
    }
}
