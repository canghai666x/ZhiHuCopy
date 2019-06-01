package com.canghai.zhihucopy.domain;

import java.util.Date;

public class Reply {
    private int replyId;
    private int commentId;
    private int userId;
    private String content;
    private boolean isDeleted;
    private Date createTime;

    @Override
    public String toString() {
        return "Reply{" +
                "replyId=" + replyId +
                ", commentId=" + commentId +
                ", userId=" + userId +
                ", content='" + content + '\'' +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }

    public int getReplyId() {
        return replyId;
    }

    public void setReplyId(int replyId) {
        this.replyId = replyId;
    }

    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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
