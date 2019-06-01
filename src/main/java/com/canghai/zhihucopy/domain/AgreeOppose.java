package com.canghai.zhihucopy.domain;

public class AgreeOppose {
    private int agreeId;
    private int userId;
    private int answerId;
    private String agreeOppose;

    @Override
    public String toString() {
        return "AgreeOppose{" +
                "agreeId=" + agreeId +
                ", userId=" + userId +
                ", answerId=" + answerId +
                ", agreeOppose='" + agreeOppose + '\'' +
                '}';
    }

    public int getAgreeId() {
        return agreeId;
    }

    public void setAgreeId(int agreeId) {
        this.agreeId = agreeId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAnswerId() {
        return answerId;
    }

    public void setAnswerId(int answerId) {
        this.answerId = answerId;
    }

    public String getAgreeOppose() {
        return agreeOppose;
    }

    public void setAgreeOppose(String agreeOppose) {
        this.agreeOppose = agreeOppose;
    }
}
