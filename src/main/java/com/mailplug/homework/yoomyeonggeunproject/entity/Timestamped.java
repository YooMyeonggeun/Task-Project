package com.mailplug.homework.yoomyeonggeunproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {

    //생성날자
    @CreatedDate
    @Column(name = "create_at", updatable = false)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime create_at;
    //수정날짜
    @LastModifiedDate
    @Column(name = "update_at")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDateTime update_at;
}
