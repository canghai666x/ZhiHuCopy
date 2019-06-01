package com.canghai.zhihucopy.domain;

import java.util.Date;

public class Question {
    private int questionId;
    private String questionName;
    private String questionDescribe;
    private int answerNumber;
    private int attentionNumber;
    private int QuestionerId;
    private boolean isDeleted;
    private Date createTime;

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionName='" + questionName + '\'' +
                ", questionDescribe='" + questionDescribe + '\'' +
                ", answerNumber=" + answerNumber +
                ", attentionNumber=" + attentionNumber +
                ", QuestionerId=" + QuestionerId +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }

    public int getQuestionId() {
        return questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionName() {
        return questionName;
    }

    public void setQuestionName(String questionName) {
        this.questionName = questionName;
    }

    public String getQuestionDescribe() {
        return questionDescribe;
    }

    public void setQuestionDescribe(String questionDescribe) {
        this.questionDescribe = questionDescribe;
    }

    public int getAnswerNumber() {
        return answerNumber;
    }

    public void setAnswerNumber(int answerNumber) {
        this.answerNumber = answerNumber;
    }

    public int getAttentionNumber() {
        return attentionNumber;
    }

    public void setAttentionNumber(int attentionNumber) {
        this.attentionNumber = attentionNumber;
    }

    public int getQuestionerId() {
        return QuestionerId;
    }

    public void setQuestionerId(int questionerId) {
        QuestionerId = questionerId;
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
