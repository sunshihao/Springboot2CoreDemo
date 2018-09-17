package com.sssh.controller;

import com.mybatis.model.CnUser;
import com.sssh.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@RestController
public class TestController {

    @Autowired
    private testService test;



    @RequestMapping("/inde")
    public List login(){

        return test.getList();
    }

    @RequestMapping("/index")
    public List login(@RequestParam("id") Integer id){

        return test.getList();
    }
}