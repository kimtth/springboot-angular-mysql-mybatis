package com.example.demo.model;

public class ResponseUtils {
    public static <T> ResponseResult<T> success(String responseCode, T response) {
        return new ResponseResult<T>(responseCode, response, null);
    }
    
    public static <T> ResponseResult<T> fail(String responseCode, T response, String errMsg) {
        return new ResponseResult<T>(responseCode, response, errMsg);
    }
}