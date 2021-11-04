package com.example.demotest.entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @ClassName: SysUserPostEntity
 * @Description:
 * @Author: Administrator
 * @Date: 2021/11/4 11:28
 */
@Entity
@Table(name = "sys_user_post", schema = "demo", catalog = "")
@IdClass(SysUserPostEntityPK.class)
public class SysUserPostEntity {
    private long userId;
    private long postId;

    @Id
    @Column(name = "user_id")
    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "post_id")
    public long getPostId() {
        return postId;
    }

    public void setPostId(long postId) {
        this.postId = postId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SysUserPostEntity that = (SysUserPostEntity) o;
        return userId == that.userId && postId == that.postId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, postId);
    }
}
