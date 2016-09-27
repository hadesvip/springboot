package com.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 首页
 * Created by wangyong on 2016/9/26.
 */
@RestController
public class HomeController {

    @RequestMapping("/")
    public String home() {
        return "hello,springboot...";
    }
}
