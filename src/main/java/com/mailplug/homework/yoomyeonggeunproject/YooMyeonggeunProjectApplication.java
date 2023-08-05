package com.mailplug.homework.yoomyeonggeunproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class YooMyeonggeunProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(YooMyeonggeunProjectApplication.class, args);
    }

}
