package com.project.dubbo.base.service;


import org.apache.dubbo.config.annotation.Service;
import org.dromara.hmily.annotation.HmilyTCC;
import xiao.project.dubbo.service.api.TestService;


/**
 * @author Satsuki
 * @time 2019/8/27 15:35
 * @description:
 * 模拟数据库事务实现
 */
@Service(version = "1.0.0")
//@Service(version = "1.0.0")
public class TestServiceImpl implements TestService {
    @Override
    public void ins() {
        System.out.println("insert");
    }

    @Override
    public void del() {
        System.out.println("delete");
    }

    @Override
    public void upd() {
        System.out.println("update");
    }

    @Override
    public void sel() {
        System.out.println("select");
    }
    @HmilyTCC(confirmMethod = "testConfrim", cancelMethod = "testCancel")
    @Override
    public void test(String msg) {
        System.out.println("HmilyTCC   准备中");
    }
    public void testConfrim(String msg) {

        System.out.println("HmilyTCC   成功准备中");
        int ss = 1/0;
    }
    public void testCancel(String msg) {
        System.out.println("HmilyTCC  失败准备中");
    }
}

