package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysUserOnlineEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_user_online", schema = "demo", catalog = "")
public class SysUserOnlineEntity {
    private String sessionId;
    private String loginName;
    private String deptName;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private String status;
    private Timestamp startTimestamp;
    private Timestamp lastAccessTime;
    private Integer expireTime;

    @Id
    @Column(name = "sessionId")
    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @Basic
    @Column(name = "login_name")
    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
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
    @Column(name = "ipaddr")
    public String getIpaddr() {
        return ipaddr;
    }

    public void setIpaddr(String ipaddr) {
        this.ipaddr = ipaddr;
    }

    @Basic
    @Column(name = "login_location")
    public String getLoginLocation() {
        return loginLocation;
    }

    public void setLoginLocation(String loginLocation) {
        this.loginLocation = loginLocation;
    }

    @Basic
    @Column(name = "browser")
    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    @Basic
    @Column(name = "os")
    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
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
    @Column(name = "start_timestamp")
    public Timestamp getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Timestamp startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    @Basic
    @Column(name = "last_access_time")
    public Timestamp getLastAccessTime() {
        return lastAccessTime;
    }

    public void setLastAccessTime(Timestamp lastAccessTime) {
        this.lastAccessTime = lastAccessTime;
    }

    @Basic
    @Column(name = "expire_time")
    public Integer getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Integer expireTime) {
        this.expireTime = expireTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserOnlineEntity that = (SysUserOnlineEntity) o;
        return Objects.equals(sessionId, that.sessionId) && Objects.equals(loginName, that.loginName) && Objects.equals(deptName, that.deptName) && Objects.equals(ipaddr, that.ipaddr) && Objects.equals(loginLocation, that.loginLocation) && Objects.equals(browser, that.browser) && Objects.equals(os, that.os) && Objects.equals(status, that.status) && Objects.equals(startTimestamp, that.startTimestamp) && Objects.equals(lastAccessTime, that.lastAccessTime) && Objects.equals(expireTime, that.expireTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sessionId, loginName, deptName, ipaddr, loginLocation, browser, os, status, startTimestamp, lastAccessTime, expireTime);
    }
}
