package com.mailplug.homework.yoomyeonggeunproject.repository;

import com.mailplug.homework.yoomyeonggeunproject.entity.Board;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BoardRepository extends JpaRepository<Board, Long> {

    //전체조회
    Page<Board> findAll(Pageable pageable);

    //단건조회
    public List<Board> findByName(String keyword, Pageable pageable);
}
