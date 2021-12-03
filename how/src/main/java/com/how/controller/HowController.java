package com.how.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: 坚持的力量
 * @Date: 2021/12/3 14:32
 * @Version: 11
 */
@RestController()
@RequestMapping("/how")
public class HowController {

    @RequestMapping("/get")
    public String getHow(){
        return "hello how,what are you think?";
    }
}
