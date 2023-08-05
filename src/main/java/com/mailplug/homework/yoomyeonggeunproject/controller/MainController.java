package com.mailplug.homework.yoomyeonggeunproject.controller;

import com.mailplug.homework.yoomyeonggeunproject.dto.RequestBoardDto;
import com.mailplug.homework.yoomyeonggeunproject.dto.ResponseBoardDto;
import com.mailplug.homework.yoomyeonggeunproject.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class MainController {

    private final BoardService taskService;


    //전체조회
    @GetMapping("/allsearch")
    public List<ResponseBoardDto> allsearch(Pageable pageable) {
        return  taskService.allsearch(pageable);
    }

    //키워드조회(단건조회)
    @GetMapping("/onesearch")
    public List<ResponseBoardDto> onesearch(String keyword) {
        return taskService.onesearch(keyword);
    }

    //등록
    @PostMapping("/register")
    public ResponseEntity<String> register(RequestBoardDto boardDto) {
        return taskService.register(boardDto);
    }

    //수정
    @PutMapping("/update")
    public ResponseEntity<String> update(Long userid, RequestBoardDto boardDto) {
        return taskService.update(userid, boardDto);
    }

    //삭제
    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(Long userid, RequestBoardDto boardDto) {
        return taskService.delete(userid, boardDto);
    }

}
