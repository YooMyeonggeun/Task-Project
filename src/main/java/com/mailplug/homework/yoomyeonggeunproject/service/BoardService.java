package com.mailplug.homework.yoomyeonggeunproject.service;

import com.mailplug.homework.yoomyeonggeunproject.dto.RequestBoardDto;
import com.mailplug.homework.yoomyeonggeunproject.dto.ResponseBoardDto;
import com.mailplug.homework.yoomyeonggeunproject.dto.ResponseDto;
import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import com.mailplug.homework.yoomyeonggeunproject.exception.ErrorException;
import com.mailplug.homework.yoomyeonggeunproject.exception.ExceptionEnum;
import com.mailplug.homework.yoomyeonggeunproject.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
@Transactional
public class BoardService {

    private final BoardRepository boardRepository;


    //전체조회
    @Transactional(readOnly = true)
    public List<ResponseBoardDto> allsearch(Pageable pageable) {
       return boardRepository.findAll(pageable).stream().map(ResponseBoardDto::new)
                .collect(Collectors.toList());
    }

    //단건조회
    @Transactional(readOnly = true)
    public List<ResponseBoardDto> onesearch(String keyword, Pageable pageable) {
       return boardRepository.findByName(keyword, pageable).stream().map(ResponseBoardDto::new)
               .collect(Collectors.toList());
    }

    //게시글 등록
    public ResponseDto<String> register(String userid, RequestBoardDto boardDto) {
        boardDto.setUserid(userid);
        if(boardDto.getName().length() > 100){
            return ResponseDto.setFail("제목이 100글자를 넘었습니다",null);
        }else{
            boardRepository.save(Board.builder().requestBoardDto(boardDto).build());
            return ResponseDto.setSuccess("게시글이 등록되었습니다", null);
        }

    }


    // 게시글 수정
    public ResponseDto<String> update(String userid, Long id, RequestBoardDto boardDto) {
        // 수정할 게시글이 존재하는지 확인
        Optional<Board> board = boardRepository.findById(id);
        if(!board.isPresent()){
            return  ResponseDto.setFail(ExceptionEnum.UPDATE_NOT_FOUND.getMessage(), null);
        }
        // 수정권한 체크
        if (board.get().getUserid().equals(userid)) {
            boardDto.setUserid(userid);
            board.get().BoardUpdate(boardDto);
            return  ResponseDto.setSuccess("수정이 완료되었습니다", null);
        } else {
            return ResponseDto.setFail(ExceptionEnum.UPDATE_Authorization_NOT_FOUND.getMessage(), null);
        }
    }


    //게시글 삭제
    public ResponseDto<String> delete(Long id, String userid) {
        // 삭제할 게시글이 존재하는지 확인
        Optional<Board> board = boardRepository.findById(id);
        if(!board.isPresent()){
            return ResponseDto.setFail(ExceptionEnum.DELETE_NOT_FOUND.getMessage(), null);
        }
        // 삭제권한 체크
        if (board.get().getUserid().equals(userid)) {
            boardRepository.deleteById(id);
            return  ResponseDto.setSuccess("삭제가 완료되었습니다", null);
        } else {
            return ResponseDto.setFail(ExceptionEnum.DELETE_Authorization_NOT_FOUND.getMessage(), null);
        }
    }
}
