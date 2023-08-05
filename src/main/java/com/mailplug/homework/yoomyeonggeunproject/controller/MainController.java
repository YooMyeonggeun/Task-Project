package com.mailplug.homework.yoomyeonggeunproject.controller;

import com.mailplug.homework.yoomyeonggeunproject.dto.BoardDto;
import com.mailplug.homework.yoomyeonggeunproject.dto.ResponseDto;
import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import com.mailplug.homework.yoomyeonggeunproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {

    private final BoardService taskService;


    //전체조회
    @GetMapping("/allsearch")
    public String allsearch(Pageable pageable){
        taskService.allsearch(pageable);
        return "전체조회";
    }

    //단건조회
    @GetMapping("/onesearch")
    public String onesearch(String keyword){
        taskService.onesearch(keyword);
        return "단건조회";
    }

    //등록
    @PostMapping("/register")
    public ResponseDto register(BoardDto boardDto){
        return taskService.register(boardDto);
    }

    //수정
    @PutMapping("/update")
    public String update(@RequestHeader("X-USERID") String userid, String title, String contant){
        taskService.update(userid, title, contant);
        return "수정";
    }

    //삭제
    @DeleteMapping("/delete")
    public String delete(@RequestHeader("X-USERID") String id){
        taskService.delete(id);
        return "삭제";
    }

}
