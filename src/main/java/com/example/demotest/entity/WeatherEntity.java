package com.example.demotest.entity;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

/**
 * @ClassName: WeatherEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "weather", schema = "demo", catalog = "")
public class WeatherEntity {
    private int id;
    private String createdBy;
    private Date createdDate;
    private String lastModifiedBy;
    private Date lastModifiedDate;
    private String deleted;
    private String city;
    private String updateTime;
    private String date;
    private String weather;
    private String direct;
    private String wind;
    private String temp;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "created_by")
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Basic
    @Column(name = "created_date")
    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    @Basic
    @Column(name = "last_modified_by")
    public String getLastModifiedBy() {
        return lastModifiedBy;
    }

    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    @Basic
    @Column(name = "last_modified_date")
    public Date getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Basic
    @Column(name = "deleted")
    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "update_time")
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Basic
    @Column(name = "date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Basic
    @Column(name = "weather")
    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    @Basic
    @Column(name = "direct")
    public String getDirect() {
        return direct;
    }

    public void setDirect(String direct) {
        this.direct = direct;
    }

    @Basic
    @Column(name = "wind")
    public String getWind() {
        return wind;
    }

    public void setWind(String wind) {
        this.wind = wind;
    }

    @Basic
    @Column(name = "temp")
    public String getTemp() {
        return temp;
    }

    public void setTemp(String temp) {
        this.temp = temp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WeatherEntity that = (WeatherEntity) o;
        return id == that.id && Objects.equals(createdBy, that.createdBy) && Objects.equals(createdDate, that.createdDate) && Objects.equals(lastModifiedBy, that.lastModifiedBy) && Objects.equals(lastModifiedDate, that.lastModifiedDate) && Objects.equals(deleted, that.deleted) && Objects.equals(city, that.city) && Objects.equals(updateTime, that.updateTime) && Objects.equals(date, that.date) && Objects.equals(weather, that.weather) && Objects.equals(direct, that.direct) && Objects.equals(wind, that.wind) && Objects.equals(temp, that.temp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, createdBy, createdDate, lastModifiedBy, lastModifiedDate, deleted, city, updateTime, date, weather, direct, wind, temp);
    }
}
