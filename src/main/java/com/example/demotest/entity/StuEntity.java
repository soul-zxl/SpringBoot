package com.example.demotest.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

/**
 * @ClassName: StuEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "stu", schema = "demo", catalog = "")
public class StuEntity {
    private Integer id;
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private Integer math;
    private Integer english;

    @Basic
    @Column(name = "id")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "age")
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "math")
    public Integer getMath() {
        return math;
    }

    public void setMath(Integer math) {
        this.math = math;
    }

    @Basic
    @Column(name = "english")
    public Integer getEnglish() {
        return english;
    }

    public void setEnglish(Integer english) {
        this.english = english;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StuEntity stuEntity = (StuEntity) o;
        return Objects.equals(id, stuEntity.id) && Objects.equals(name, stuEntity.name) && Objects.equals(age, stuEntity.age) && Objects.equals(sex, stuEntity.sex) && Objects.equals(address, stuEntity.address) && Objects.equals(math, stuEntity.math) && Objects.equals(english, stuEntity.english);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, age, sex, address, math, english);
    }
}
