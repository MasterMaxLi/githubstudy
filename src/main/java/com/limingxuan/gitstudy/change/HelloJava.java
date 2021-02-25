package com.limingxuan.gitstudy.change;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Creqated by Limingxuan on 2021/2/26
 */
@RestController
public class HelloJava {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Java";
    }
}