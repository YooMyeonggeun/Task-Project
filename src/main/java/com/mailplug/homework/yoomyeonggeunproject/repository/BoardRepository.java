package com.mailplug.homework.yoomyeonggeunproject.repository;

import com.mailplug.homework.yoomyeonggeunproject.dto.BoardDto;
import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;

public interface BoardRepository extends JpaRepository<Board, Long> {

    //전체조회
//    public BoardDto findAll(Pageable pageable);

    //단건조회
    public BoardDto findByName(String keyword);
}
