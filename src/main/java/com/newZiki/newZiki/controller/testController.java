package com.newZiki.newZiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wzk
 * @version 1.0
 * @description
 * @createDate 2020/5/15 0015 16:04
 **/
@Controller
@RequestMapping("/index")
public class testController {

    @RequestMapping("/")
    public String index(){

        return  "";
    }
}
