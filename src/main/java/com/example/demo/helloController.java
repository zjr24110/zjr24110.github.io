package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ZJR
 * @version 1.0
 * @date 2020/2/21 16:23
 */
@RestController
@RequestMapping("/hello")
public class helloController {
    @RequestMapping("/d")
    public String hello(){
        System.out.println("tamade");
        return "demata" ;
    }

}
