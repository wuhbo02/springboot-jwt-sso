package com.sso.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: whb
 * @create: 2019-12-03 11:55
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/query")
    public String query(){
        return "success";
    }

    @RequestMapping("/update")
    public String update(){
        return "update";
    }
}

