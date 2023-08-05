package com.mailplug.homework.yoomyeonggeunproject.service;

import com.mailplug.homework.yoomyeonggeunproject.dto.BoardDto;
import com.mailplug.homework.yoomyeonggeunproject.dto.ResponseDto;
import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import com.mailplug.homework.yoomyeonggeunproject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Pageable;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;


    //전체조회
    @Transactional(readOnly = true)
    public void allsearch(Pageable pageable) {
        boardRepository.findAll();
    }

    //단건조회
    @Transactional(readOnly = true)
    public void onesearch(String keyword) {
        boardRepository.findByName(keyword);
    }

    //게시글 등록
    public ResponseDto<Board> register(BoardDto boardDto) {
        System.out.println("등록 : "+boardDto.toString());
        boardRepository.save(Board.builder().boardDto(boardDto).build());
        return ResponseDto.setSuccess("등록에 성공하였습니다", null);
    }


    // 게시글 수정
    public ResponseDto<Board> update(String userid, String title, String contant) {
        if (userid.equals("")) {
            return null;
        } else {
            return ResponseDto.setFail("본인이 작성한 게시글만 수정할 수 있습니다", null);
        }
    }


    //게시글 삭제
    public ResponseDto<Board> delete(String id) {
        if (id.equals("")) {
            return null;
        } else {
            return ResponseDto.setFail("본인이 작성한 게시글만 수정할 수 있습니다", null);
        }
    }
}
