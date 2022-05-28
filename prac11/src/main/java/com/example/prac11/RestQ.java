package com.example.prac11;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestQ {
    @RequestMapping("/gaga")
    public String rest(){
        return "QWERTY";
    }
}
