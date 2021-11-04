package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

/**
 * @ClassName: SysLogininforEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_logininfor", schema = "demo", catalog = "")
public class SysLogininforEntity {
    private long infoId;
    private String loginName;
    private String ipaddr;
    private String loginLocation;
    private String browser;
    private String os;
    private String status;
    private String msg;
    private Timestamp loginTime;

    @Id
    @Column(name = "info_id")
    public long getInfoId() {
        return infoId;
    }

    public void setInfoId(long infoId) {
        this.infoId = infoId;
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
    @Column(name = "msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Basic
    @Column(name = "login_time")
    public Timestamp getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Timestamp loginTime) {
        this.loginTime = loginTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysLogininforEntity that = (SysLogininforEntity) o;
        return infoId == that.infoId && Objects.equals(loginName, that.loginName) && Objects.equals(ipaddr, that.ipaddr) && Objects.equals(loginLocation, that.loginLocation) && Objects.equals(browser, that.browser) && Objects.equals(os, that.os) && Objects.equals(status, that.status) && Objects.equals(msg, that.msg) && Objects.equals(loginTime, that.loginTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(infoId, loginName, ipaddr, loginLocation, browser, os, status, msg, loginTime);
    }
}
