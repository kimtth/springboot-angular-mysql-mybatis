package com.example.demo.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseResult<T>{
    private final String rs_code;
    private final T response;
    private final String errorMsg;
    public ResponseResult(String responseCode, T response, String errorMsg) {
        this.rs_code = responseCode;
        this.response = response;
        this.errorMsg = errorMsg;
    }
}
