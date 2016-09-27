package com.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户
 * Created by wangyong on 16-5-10.
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getUserName(@PathVariable String username) {
        return "hello," + username;
    }

}
