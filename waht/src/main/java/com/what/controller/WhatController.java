package com.what.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 坚持的力量
 * @Date: 2021/12/3 14:40
 * @Version: 11
 */
@RestController
@RequestMapping("/what")
public class WhatController {

    @RequestMapping("get")
    public String getWhat(){
        return "hello what";
    }
}
