package com.lee.demo.docker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by hzlifan on 2017/3/15.
 */
@RestController
public class IndexController {

    @GetMapping(value = "/")
    public String index() {
        return "hello world";
    }

}
