package com.canghai.zhihucopy.domain;

import java.util.Date;

public class Answer {
    private int answerId;
    private int userId;
    private int questionId;
    private String answerContent;
    private boolean anonymous;
    private int commentNumber;
    private int reportNumber;
    private boolean isDeleted;
    private Date createTime;

    @Override
    public String toString() {
        return "Answer{" +
                "answerId=" + answerId +
                ", userId=" + userId +
                ", questionId=" + questionId +
                ", answerContent='" + answerContent + '\'' +
                ", anonymous=" + anonymous +
                ", commentNumber=" + commentNumber +
                ", reportNumber=" + reportNumber +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
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

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getAnswerContent() {
        return answerContent;
    }

    public void setAnswerContent(String answerContent) {
        this.answerContent = answerContent;
    }

    public boolean isAnonymous() {
        return anonymous;
    }

    public void setAnonymous(boolean anonymous) {
        this.anonymous = anonymous;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public void setCommentNumber(int commentNumber) {
        this.commentNumber = commentNumber;
    }

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
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
