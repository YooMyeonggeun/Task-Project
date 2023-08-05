package com.mailplug.homework.yoomyeonggeunproject.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {

    //생성날자
    @CreatedDate
    private LocalDateTime create_at;
    //수정날짜
    @LastModifiedDate
    private LocalDateTime update_at;
}
