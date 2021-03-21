package xiao.project.dubbo.service.api;

import org.dromara.hmily.annotation.Hmily;

import java.util.Map;

public interface TestService {

    Map<String, Object> findA(Map<String, Object> param);
    Map<String, Object> findB(Map<String, Object> param);
    public void upd();
    public void sel();
    @Hmily
    public void test(Integer money);


    Map<String, Object> addA(Map<String, Object> param);

    Map<String, Object> addB(Map<String, Object> param);
}
