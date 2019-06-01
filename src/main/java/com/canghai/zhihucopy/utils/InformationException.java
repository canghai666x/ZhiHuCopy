package com.canghai.zhihucopy.utils;

public class InformationException extends RuntimeException{
    private ErrorCode errorCode;

    public ErrorCode getErrorCode(){
        return errorCode;
    }

    public InformationException(final String s){
        super(s);}
    public InformationException(final ErrorCode errorCode){
        this.errorCode=errorCode;
    }
    public String getMessage(){
        return errorCode==null?super.getMessage():errorCode.getText();
    }
}
