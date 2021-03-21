package com.project.dubbo.base.dao;

import java.util.Map;

public interface TestMapper {
    Map<String,Object> find(Map<String,Object> param);
    void update(Map<String,Object> param);
    Map<String,Object> findfrozen(Map<String,Object> param);
    void updatefrozen(Map<String,Object> param);
}
