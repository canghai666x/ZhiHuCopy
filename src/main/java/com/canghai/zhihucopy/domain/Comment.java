package com.canghai.zhihucopy.domain;

import java.util.Date;

public class Comment {
    private int commentId;
    private int answerId;
    private int userId;
    private String content;
    private boolean isDeleted;
    private Date createTime;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", answerId=" + answerId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isDeleted() {
        return isDeleted;
    }

    public void setDeleted(boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
