package com.project.dubbo.base.controller;


import com.alibaba.fastjson.JSONObject;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.project.dubbo.service.api.TestService;

import java.util.HashMap;
import java.util.Map;


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

    @RequestMapping("/findA")
    public String findA(){
        Map<String ,Object> param = new HashMap<>();
        param.put("userId",2);
        Map<String,Object> map= testServiceImpl.findA(param);
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("/findB")
    public String findB(){
        Map<String ,Object> param = new HashMap<>();
        param.put("userId",1);
        Map<String,Object> map= testServiceImpl.findB(param);
        return JSONObject.toJSONString(map);
    }
    @RequestMapping("/addMoneyA/${money}")
    public String addA(@PathVariable("money") Integer money){
        Map<String ,Object> param = new HashMap<>();
        param.put("userId",2);
        param.put("money",money);
        Map<String,Object> map= testServiceImpl.addA(param);
        return JSONObject.toJSONString(map);
    }

    @RequestMapping("/addMoneyB/${money}")
    public String addB(@PathVariable("money") Integer money){
        Map<String ,Object> param = new HashMap<>();
        param.put("userId",1);
        param.put("money",money);
        Map<String,Object> map= testServiceImpl.addB(param);
        return JSONObject.toJSONString(map);
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

    @RequestMapping("/testAToB/${money}")
    public String test(@PathVariable("money") Integer money){
        testServiceImpl.test(money);
        return "success";
    }
}
