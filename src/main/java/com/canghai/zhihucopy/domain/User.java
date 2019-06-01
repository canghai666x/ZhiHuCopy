package com.canghai.zhihucopy.domain;

import java.util.Date;

public class User {
    private int userID;
    private String account;
    private String userName;
    private String password;
    private String gender;
    private String photo;
    private String autograph;
    private String introduce;
    private int agreeNumber;
    private int thankNumber;
    private int collectNumber;
    private int questionNumber;
    private int answerNumber;
    private int attentionNumber;
    private int concernNumber;
    private int ConcernQuestionNumber;
    private String email;
    private String school;
    private String position;
    private String company;
    private boolean forbidden;
    private Date forbiddenTime;
    private String role;
    private boolean isDeleted;
    private Date createTime;



    @Override
    public String toString() {
        return "User{" +
                "userID=" + userID +
                ", account='" + account + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", gender=" + gender +
                ", photo='" + photo + '\'' +
                ", autograph='" + autograph + '\'' +
                ", introduce='" + introduce + '\'' +
                ", agreeNumber=" + agreeNumber +
                ", thankNumber=" + thankNumber +
                ", collectNumber=" + collectNumber +
                ", questionNumber=" + questionNumber +
                ", answerNumber=" + answerNumber +
                ", attentionNumber=" + attentionNumber +
                ", concernNumber=" + concernNumber +
                ", ConcernQuestionNumber=" + ConcernQuestionNumber +
                ", email='" + email + '\'' +
                ", school='" + school + '\'' +
                ", position='" + position + '\'' +
                ", company='" + company + '\'' +
                ", forbidden=" + forbidden +
                ", forbiddenTime=" + forbiddenTime +
                ", role='" + role + '\'' +
                ", isDeleted=" + isDeleted +
                ", createTime=" + createTime +
                '}';
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getAutograph() {
        return autograph;
    }

    public void setAutograph(String autograph) {
        this.autograph = autograph;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public int getAgreeNumber() {
        return agreeNumber;
    }

    public void setAgreeNumber(int agreeNumber) {
        this.agreeNumber = agreeNumber;
    }

    public int getThankNumber() {
        return thankNumber;
    }

    public void setThankNumber(int thankNumber) {
        this.thankNumber = thankNumber;
    }

    public int getCollectNumber() {
        return collectNumber;
    }

    public void setCollectNumber(int collectNumber) {
        this.collectNumber = collectNumber;
    }

    public int getQuestionNumber() {
        return questionNumber;
    }

    public void setQuestionNumber(int questionNumber) {
        this.questionNumber = questionNumber;
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

    public int getConcernNumber() {
        return concernNumber;
    }

    public void setConcernNumber(int concernNumber) {
        this.concernNumber = concernNumber;
    }

    public int getConcernQuestionNumber() {
        return ConcernQuestionNumber;
    }

    public void setConcernQuestionNumber(int concernQuestionNumber) {
        ConcernQuestionNumber = concernQuestionNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isForbidden() {
        return forbidden;
    }

    public void setForbidden(boolean forbidden) {
        this.forbidden = forbidden;
    }

    public Date getForbiddenTime() {
        return forbiddenTime;
    }

    public void setForbiddenTime(Date forbiddenTime) {
        this.forbiddenTime = forbiddenTime;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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
