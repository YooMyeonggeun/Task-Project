package com.mailplug.homework.yoomyeonggeunproject.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ExceptionEnum{
    UPDATE_NOT_FOUND("수정할 게시글이 존재하지 않습니다", HttpStatus.NOT_FOUND.value()),
    DELETE_NOT_FOUND("삭제할 게시글이 존재하지 않습니다", HttpStatus.NOT_FOUND.value()),
    UPDATE_Authorization_NOT_FOUND("수정할 권한이 없습니다", HttpStatus.NO_CONTENT.value()),
    DELETE_Authorization_NOT_FOUND("삭제할 권한이 없습니다", HttpStatus.NO_CONTENT.value())
    ;
    private final int status;
    private final String message;

    ExceptionEnum(String message, int status) {
        this.status = status;
        this.message = message;
    }
}