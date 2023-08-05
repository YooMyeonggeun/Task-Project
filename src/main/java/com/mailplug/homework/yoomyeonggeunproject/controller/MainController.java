package com.mailplug.homework.yoomyeonggeunproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainController {

    @GetMapping("/onesearch")
    public String onesearch(){
        return "단건조회";
    }

}
