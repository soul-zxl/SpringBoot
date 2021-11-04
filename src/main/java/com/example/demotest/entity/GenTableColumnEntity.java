package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: GenTableColumnEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "gen_table_column", schema = "demo", catalog = "")
public class GenTableColumnEntity {
    private long columnId;
    private String tableId;
    private String columnName;
    private String columnComment;
    private String columnType;
    private String javaType;
    private String javaField;
    private String isPk;
    private String isIncrement;
    private String isRequired;
    private String isInsert;
    private String isEdit;
    private String isList;
    private String isQuery;
    private String queryType;
    private String htmlType;
    private String dictType;
    private Integer sort;
    private String createBy;
    private Timestamp createTime;
    private String updateBy;
    private Timestamp updateTime;

    @Id
    @Column(name = "column_id")
    public long getColumnId() {
        return columnId;
    }

    public void setColumnId(long columnId) {
        this.columnId = columnId;
    }

    @Basic
    @Column(name = "table_id")
    public String getTableId() {
        return tableId;
    }

    public void setTableId(String tableId) {
        this.tableId = tableId;
    }

    @Basic
    @Column(name = "column_name")
    public String getColumnName() {
        return columnName;
    }

    public void setColumnName(String columnName) {
        this.columnName = columnName;
    }

    @Basic
    @Column(name = "column_comment")
    public String getColumnComment() {
        return columnComment;
    }

    public void setColumnComment(String columnComment) {
        this.columnComment = columnComment;
    }

    @Basic
    @Column(name = "column_type")
    public String getColumnType() {
        return columnType;
    }

    public void setColumnType(String columnType) {
        this.columnType = columnType;
    }

    @Basic
    @Column(name = "java_type")
    public String getJavaType() {
        return javaType;
    }

    public void setJavaType(String javaType) {
        this.javaType = javaType;
    }

    @Basic
    @Column(name = "java_field")
    public String getJavaField() {
        return javaField;
    }

    public void setJavaField(String javaField) {
        this.javaField = javaField;
    }

    @Basic
    @Column(name = "is_pk")
    public String getIsPk() {
        return isPk;
    }

    public void setIsPk(String isPk) {
        this.isPk = isPk;
    }

    @Basic
    @Column(name = "is_increment")
    public String getIsIncrement() {
        return isIncrement;
    }

    public void setIsIncrement(String isIncrement) {
        this.isIncrement = isIncrement;
    }

    @Basic
    @Column(name = "is_required")
    public String getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(String isRequired) {
        this.isRequired = isRequired;
    }

    @Basic
    @Column(name = "is_insert")
    public String getIsInsert() {
        return isInsert;
    }

    public void setIsInsert(String isInsert) {
        this.isInsert = isInsert;
    }

    @Basic
    @Column(name = "is_edit")
    public String getIsEdit() {
        return isEdit;
    }

    public void setIsEdit(String isEdit) {
        this.isEdit = isEdit;
    }

    @Basic
    @Column(name = "is_list")
    public String getIsList() {
        return isList;
    }

    public void setIsList(String isList) {
        this.isList = isList;
    }

    @Basic
    @Column(name = "is_query")
    public String getIsQuery() {
        return isQuery;
    }

    public void setIsQuery(String isQuery) {
        this.isQuery = isQuery;
    }

    @Basic
    @Column(name = "query_type")
    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    @Basic
    @Column(name = "html_type")
    public String getHtmlType() {
        return htmlType;
    }

    public void setHtmlType(String htmlType) {
        this.htmlType = htmlType;
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
    @Column(name = "sort")
    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GenTableColumnEntity that = (GenTableColumnEntity) o;
        return columnId == that.columnId && Objects.equals(tableId, that.tableId) && Objects.equals(columnName, that.columnName) && Objects.equals(columnComment, that.columnComment) && Objects.equals(columnType, that.columnType) && Objects.equals(javaType, that.javaType) && Objects.equals(javaField, that.javaField) && Objects.equals(isPk, that.isPk) && Objects.equals(isIncrement, that.isIncrement) && Objects.equals(isRequired, that.isRequired) && Objects.equals(isInsert, that.isInsert) && Objects.equals(isEdit, that.isEdit) && Objects.equals(isList, that.isList) && Objects.equals(isQuery, that.isQuery) && Objects.equals(queryType, that.queryType) && Objects.equals(htmlType, that.htmlType) && Objects.equals(dictType, that.dictType) && Objects.equals(sort, that.sort) && Objects.equals(createBy, that.createBy) && Objects.equals(createTime, that.createTime) && Objects.equals(updateBy, that.updateBy) && Objects.equals(updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(columnId, tableId, columnName, columnComment, columnType, javaType, javaField, isPk, isIncrement, isRequired, isInsert, isEdit, isList, isQuery, queryType, htmlType, dictType, sort, createBy, createTime, updateBy, updateTime);
    }
}
