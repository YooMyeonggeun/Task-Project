package com.mailplug.homework.yoomyeonggeunproject.dto;

import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
public class ResponseBoardDto {

    private Long id; // 고유번호
    private String userid; // 사용자 아이디
    private String name; // 게시판 이름
    private String contant; // 게시판 내용
    private LocalDateTime create_at; // 생성 날짜
    private LocalDateTime update_at; // 수정 날짜

    public ResponseBoardDto(Board board){
        this.userid = board.getUserid();
        this.name = board.getName();
        this.contant = board.getContant();
        this.create_at = board.getCreate_at();
        this.update_at = board.getUpdate_at();
    }

}
