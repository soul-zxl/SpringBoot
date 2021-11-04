package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: QuestionEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:27
 */
@Entity
@Table(name = "question", schema = "demo", catalog = "")
public class QuestionEntity {
    private int id;
    private String titleChi;
    private String type;
    private String contentChi;
    private String answer;
    private String descriptionChi;
    private String readNum;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "title_chi")
    public String getTitleChi() {
        return titleChi;
    }

    public void setTitleChi(String titleChi) {
        this.titleChi = titleChi;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "content_chi")
    public String getContentChi() {
        return contentChi;
    }

    public void setContentChi(String contentChi) {
        this.contentChi = contentChi;
    }

    @Basic
    @Column(name = "answer")
    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Basic
    @Column(name = "description_chi")
    public String getDescriptionChi() {
        return descriptionChi;
    }

    public void setDescriptionChi(String descriptionChi) {
        this.descriptionChi = descriptionChi;
    }

    @Basic
    @Column(name = "read_num")
    public String getReadNum() {
        return readNum;
    }

    public void setReadNum(String readNum) {
        this.readNum = readNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        QuestionEntity that = (QuestionEntity) o;
        return id == that.id && Objects.equals(titleChi, that.titleChi) && Objects.equals(type, that.type) && Objects.equals(contentChi, that.contentChi) && Objects.equals(answer, that.answer) && Objects.equals(descriptionChi, that.descriptionChi) && Objects.equals(readNum, that.readNum);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titleChi, type, contentChi, answer, descriptionChi, readNum);
    }
}
