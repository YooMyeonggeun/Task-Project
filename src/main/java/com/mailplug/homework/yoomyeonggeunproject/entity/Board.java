package com.mailplug.homework.yoomyeonggeunproject.entity;

import com.mailplug.homework.yoomyeonggeunproject.dto.RequestBoardDto;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Getter
public class Board extends Timestamped{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; //고유번호

    @Column(nullable = false)
    private String userid; //사용자 아이디
    
    @Column(nullable = false, length = 100)
    private String name; //게시판 제목

    @Column(nullable = false)
    private String contant; // 게시판 내용


    @Builder
    public Board(RequestBoardDto requestBoardDto){
        this.userid = requestBoardDto.getUserid();
        this.name = requestBoardDto.getName();
        this.contant = requestBoardDto.getContant();
    }

    public void BoardUpdate(RequestBoardDto requestBoardDto){
        this.name = requestBoardDto.getName();
        this.contant = requestBoardDto.getContant();
    }
}
