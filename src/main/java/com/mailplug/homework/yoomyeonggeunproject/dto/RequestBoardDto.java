package com.mailplug.homework.yoomyeonggeunproject.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class RequestBoardDto {
    private String userid; // 사용자 아이디
    private String name; // 게시판 이름
    private String contant; // 게시판 내용
}
