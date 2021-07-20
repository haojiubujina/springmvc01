package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class UserController {

    //页面跳转的hanlder
    @RequestMapping("/hello.do")
    public String helloWord(Map<String, Object> map) {
        //可以在map中存放数据
        map.put("message", "map中存放的数据");
        //返回逻辑视图
        return "main";
    }
}