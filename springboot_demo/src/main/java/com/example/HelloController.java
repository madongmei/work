package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by laxe on 2018/1/3.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String say(){
        return "Hello World";
    }
}
