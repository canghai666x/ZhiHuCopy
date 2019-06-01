package com.canghai.zhihucopy.utils;

public enum ErrorCode {
        USER_ALREADY_EXIST("该用户已存在"),
        USER_NOT_EXIST("用户不存在"),
        MODIFY_USER_FAILED("修改用户失败"),
        PASSWORD_ERROR("密码错误"),
        USER_FILLED_NOT_NULL("用户信息不能为空。"),
        USER_ACCOUNT_PASSWORD_NOT_NULL("用户名和密码不能为空。"),
        DATA_FIELD_NOT_NULL("必填项不能为空。"), ID_INVALID("无效ID");
        private String text;

        ErrorCode(final String text){
            this.text=text;
        }
        public String getText(){
            return text;
        }
}
