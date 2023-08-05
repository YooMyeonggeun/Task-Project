package com.mailplug.homework.yoomyeonggeunproject.dto;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;

@AllArgsConstructor(staticName = "set")
public class ResponseDto<T> {

    private HttpStatus status;
    private String message;
    private T data;

    public static <T> ResponseDto<T> setSuccess(String message, T data){
        return ResponseDto.set(HttpStatus.OK, message, data);
    }

    public static <T> ResponseDto<T> setFail(String message, T data){
        return ResponseDto.set(HttpStatus.FAILED_DEPENDENCY, message, data);
    }
}
