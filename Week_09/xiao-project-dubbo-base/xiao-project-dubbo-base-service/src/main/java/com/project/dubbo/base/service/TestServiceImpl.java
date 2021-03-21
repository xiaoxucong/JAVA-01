package com.project.dubbo.base.service;


import com.alibaba.fastjson.JSONObject;
import com.project.dubbo.base.aop.DynamicDataSourceEnum;
import com.project.dubbo.base.aop.MyDatesourcesUrl;
import com.project.dubbo.base.dao.TestMapper;
import org.apache.dubbo.config.annotation.Service;
import org.dromara.hmily.annotation.HmilyTCC;
import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;
import xiao.project.dubbo.service.api.TestService;

import java.util.HashMap;
import java.util.Map;


/**
 * @author Satsuki
 * @time 2019/8/27 15:35
 * @description:
 * 模拟数据库事务实现
 */
@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;


    @Override
    public void upd() {
        System.out.println("update");
    }

    @Override
    public void sel() {
        System.out.println("select");
    }

    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    @HmilyTCC(confirmMethod = "testConfrim", cancelMethod = "testCancel")
    @Override
    public void test(Integer money) {
        Map<String,Object> param = new HashMap<>();
        param.put("userId",2);
        Map<String,Object> result = ((TestService) AopContext.currentProxy()).findA(param);
        Integer my = (Integer)result.get("money");
        if(my >= money) {
            param.put("money",money);
        }else {
            param.put("money",my);
        }
        ((TestServiceImpl) AopContext.currentProxy()).updateFrozenA(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public void testConfrim(Integer money) {

        Map<String,Object> paramB = new HashMap<>();
        paramB.put("userId",1);
        Map<String,Object> resultB = ((TestService) AopContext.currentProxy()).findB(paramB);
        Integer my = (Integer)resultB.get("money");
        my+=money;
        paramB.put("money",my);
        ((TestService) AopContext.currentProxy()).addB(paramB);
        Map<String,Object> param = new HashMap<>();
        param.put("userId",2);
        Map<String,Object> result = ((TestServiceImpl) AopContext.currentProxy()).findfrozenA(param);
        Integer myA = (Integer)result.get("money");
        myA =myA-money;
        param.put("money",myA);
        ((TestServiceImpl) AopContext.currentProxy()).updateFrozenA(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public void testCancel(Integer money) {
        Map<String,Object> paramB = new HashMap<>();
        paramB.put("userId",1);
        Map<String,Object> resultB = ((TestService) AopContext.currentProxy()).findB(paramB);
        Integer my = (Integer)resultB.get("money");
        my-=money;
        paramB.put("money",my);
        ((TestService) AopContext.currentProxy()).addB(paramB);
        Map<String,Object> param = new HashMap<>();
        param.put("userId",2);
        Map<String,Object> result1 = ((TestService) AopContext.currentProxy()).findA(param);
        Integer myA1 = (Integer)result1.get("money");
        Map<String,Object> result = ((TestServiceImpl) AopContext.currentProxy()).findfrozenA(param);
        Integer myA = (Integer)result.get("money");
        param.put("money",0);
        ((TestServiceImpl) AopContext.currentProxy()).updateFrozenA(param);
        myA1 +=my;
        param.put("money",myA1);
        ((TestServiceImpl) AopContext.currentProxy()).addA(param);
    }

    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    @Override
    public Map<String,Object> findA(Map<String,Object> param) {
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public Map<String,Object> findB(Map<String,Object> param) {
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    @Override
    public Map<String,Object> addA(Map<String,Object> param) {
        this.testMapper.update(param);
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public Map<String,Object> addB(Map<String,Object> param) {
        this.testMapper.update(param);
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public Map<String,Object> updateFrozenA(Map<String,Object> param) {
        this.testMapper.updatefrozen(param);
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public Map<String,Object> updateFrozenB(Map<String,Object> param) {
        this.testMapper.updatefrozen(param);
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public Map<String,Object> findfrozenA(Map<String,Object> param) {
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }

    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public Map<String,Object> findfrozenB(Map<String,Object> param) {
        System.out.println("参数="+JSONObject.toJSONString(param));
        return testMapper.find(param);
    }

}

