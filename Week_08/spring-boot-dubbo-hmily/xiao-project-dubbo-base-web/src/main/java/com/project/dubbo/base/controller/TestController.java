package com.project.dubbo.base.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.project.dubbo.service.api.TestService;


/**
 * @author Satsuki
 * @time 2019/8/27 15:58
 * @description:
 * 调用dubbo
 */
@RestController
public class TestController {

    //    @Resource
//    private TestService testServiceImpl;
    @Reference(version = "1.0.0")
    private TestService testServiceImpl;

    @RequestMapping("/ins")
    public String ins(){
        testServiceImpl.ins();
        return "ins";
    }

    @RequestMapping("/del")
    public String del(){
        testServiceImpl.del();
        return "del";
    }

    @RequestMapping("/upd")
    public String upd(){
        testServiceImpl.upd();
        return "upd";
    }

    @RequestMapping("/sel")
    public String sel(){
        testServiceImpl.sel();
        return "sel";
    }

    @RequestMapping("/test")
    public String test(){
        testServiceImpl.test("csd");
        return "test";
    }
}
