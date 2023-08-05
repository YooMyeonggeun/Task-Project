package com.mailplug.homework.yoomyeonggeunproject.exception;

import lombok.Getter;

@Getter
public class ErrorException extends RuntimeException {
    private final ExceptionEnum exceptionEnum;

    public ErrorException (ExceptionEnum exceptionEnum) {
        super(exceptionEnum.getMessage());
        this.exceptionEnum = exceptionEnum;
    }
    public int getStatus(){
        return this.exceptionEnum.getStatus();
    }
}
