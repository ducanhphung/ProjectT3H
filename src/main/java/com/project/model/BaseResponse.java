package com.project.model;

public class BaseResponse {
    public static final int SUCCESS=0;
    public static final int FAIL = 1;

    private int code;
    private String message;
    private Object data;

    public BaseResponse(){

    }

    public BaseResponse(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BaseResponse(int code, String message, Object data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static int getSUCCESS() {
        return SUCCESS;
    }

    public static int getFAIL() {
        return FAIL;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
