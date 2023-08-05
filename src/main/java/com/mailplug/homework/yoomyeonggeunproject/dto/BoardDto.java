package com.mailplug.homework.yoomyeonggeunproject.dto;

import lombok.Getter;
import lombok.ToString;

import java.time.LocalDateTime;

@Getter
@ToString
public class BoardDto {
    private String userid; // 사용자 아이디
    private String name; // 게시판 이름
    private String contant; // 게시판 내용
    private LocalDateTime create_at; //등록일
    private LocalDateTime update_at; //수정일
}
