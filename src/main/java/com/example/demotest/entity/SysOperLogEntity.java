package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysOperLogEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_oper_log", schema = "demo", catalog = "")
public class SysOperLogEntity {
    private long operId;
    private String title;
    private Integer businessType;
    private String method;
    private String requestMethod;
    private Integer operatorType;
    private String operName;
    private String deptName;
    private String operUrl;
    private String operIp;
    private String operLocation;
    private String operParam;
    private String jsonResult;
    private Integer status;
    private String errorMsg;
    private Timestamp operTime;

    @Id
    @Column(name = "oper_id")
    public long getOperId() {
        return operId;
    }

    public void setOperId(long operId) {
        this.operId = operId;
    }

    @Basic
    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Basic
    @Column(name = "business_type")
    public Integer getBusinessType() {
        return businessType;
    }

    public void setBusinessType(Integer businessType) {
        this.businessType = businessType;
    }

    @Basic
    @Column(name = "method")
    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    @Basic
    @Column(name = "request_method")
    public String getRequestMethod() {
        return requestMethod;
    }

    public void setRequestMethod(String requestMethod) {
        this.requestMethod = requestMethod;
    }

    @Basic
    @Column(name = "operator_type")
    public Integer getOperatorType() {
        return operatorType;
    }

    public void setOperatorType(Integer operatorType) {
        this.operatorType = operatorType;
    }

    @Basic
    @Column(name = "oper_name")
    public String getOperName() {
        return operName;
    }

    public void setOperName(String operName) {
        this.operName = operName;
    }

    @Basic
    @Column(name = "dept_name")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Basic
    @Column(name = "oper_url")
    public String getOperUrl() {
        return operUrl;
    }

    public void setOperUrl(String operUrl) {
        this.operUrl = operUrl;
    }

    @Basic
    @Column(name = "oper_ip")
    public String getOperIp() {
        return operIp;
    }

    public void setOperIp(String operIp) {
        this.operIp = operIp;
    }

    @Basic
    @Column(name = "oper_location")
    public String getOperLocation() {
        return operLocation;
    }

    public void setOperLocation(String operLocation) {
        this.operLocation = operLocation;
    }

    @Basic
    @Column(name = "oper_param")
    public String getOperParam() {
        return operParam;
    }

    public void setOperParam(String operParam) {
        this.operParam = operParam;
    }

    @Basic
    @Column(name = "json_result")
    public String getJsonResult() {
        return jsonResult;
    }

    public void setJsonResult(String jsonResult) {
        this.jsonResult = jsonResult;
    }

    @Basic
    @Column(name = "status")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "error_msg")
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    @Basic
    @Column(name = "oper_time")
    public Timestamp getOperTime() {
        return operTime;
    }

    public void setOperTime(Timestamp operTime) {
        this.operTime = operTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysOperLogEntity that = (SysOperLogEntity) o;
        return operId == that.operId && Objects.equals(title, that.title) && Objects.equals(businessType, that.businessType) && Objects.equals(method, that.method) && Objects.equals(requestMethod, that.requestMethod) && Objects.equals(operatorType, that.operatorType) && Objects.equals(operName, that.operName) && Objects.equals(deptName, that.deptName) && Objects.equals(operUrl, that.operUrl) && Objects.equals(operIp, that.operIp) && Objects.equals(operLocation, that.operLocation) && Objects.equals(operParam, that.operParam) && Objects.equals(jsonResult, that.jsonResult) && Objects.equals(status, that.status) && Objects.equals(errorMsg, that.errorMsg) && Objects.equals(operTime, that.operTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operId, title, businessType, method, requestMethod, operatorType, operName, deptName, operUrl, operIp, operLocation, operParam, jsonResult, status, errorMsg, operTime);
    }
}
