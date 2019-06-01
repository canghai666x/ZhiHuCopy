package com.canghai.zhihucopy.domain;

import java.util.Date;

public class AttentionQuestion {
    private int aqId;
    private int userId;
    private int questionId;
    private Date createTime;

    @Override
    public String toString() {
        return "AttentionQuestion{" +
                "aqId=" + aqId +
                ", userId=" + userId +
                ", questionId=" + questionId +
                ", createTime=" + createTime +
                '}';
    }

    public int getAqId() {
        return aqId;
    }

    public void setAqId(int aqId) {
        this.aqId = aqId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
