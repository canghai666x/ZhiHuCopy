package com.canghai.zhihucopy.utils;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class GeneralResponse {

    private enum Code{
        Success(0),
        Fail(-1),
        TokenExpired(-2),
        InternalError(500);
        private int code;
        private Code (final int code){
            this.code=code;
        }
    }

    private int code;
    private String url;
    private String message;
    private Object data;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public GeneralResponse() {
    }

    public GeneralResponse(final int code,final Object data ,final String message,final String url ) {
        this.code = code;
        this.url = url;
        this.message = message;
        this.data = data;
    }

    public static GeneralResponse ofData(final Object data){
        return new GeneralResponse(Code.Success.code,data,null,null);
    }
    public static GeneralResponse ofFail(final String message){
        return new GeneralResponse(Code.Fail.code,null,message,null);
    }
    public static GeneralResponse Success(){return new GeneralResponse(Code.Success.code,null,null,null);}

    public static GeneralResponse ofInternalError(final String message){
        return new GeneralResponse(Code.InternalError.code,null,message,null);
    }
    public static GeneralResponse ofRedirection(final String url){
        return new GeneralResponse(Code.Fail.code,null,null,url);
    }
    public static GeneralResponse ofNoAuthorization(final String message){
        return new GeneralResponse(Code.TokenExpired.code,null,message,null);
    }
}
