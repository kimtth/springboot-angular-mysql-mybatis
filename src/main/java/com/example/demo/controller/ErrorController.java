package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.example.demo.model.ResponseResult;
import com.example.demo.model.ResponseUtils;

@ControllerAdvice
public class ErrorController {
	
    @SuppressWarnings("rawtypes")
	@ExceptionHandler(Exception.class)
    protected ResponseEntity<ResponseResult> handleException(Exception e) {
         ResponseResult<String> response = ResponseUtils.fail("-9999", "something wrong", e.getMessage());
        
        return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
