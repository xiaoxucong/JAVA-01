package xiao.split.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.split.aop.DynamicDataSourceEnum;
import xiao.split.aop.MyDatesourcesUrl;
import xiao.split.mapper.TestMapper;
import xiao.split.service.TestService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public List<Map<String, Object>> findAll() {
        return testMapper.findAll();
    }

    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    @Override
    public void add_1(Long userId,long temp) {
        Map<String, Object> param = new HashMap<>();
        param.put("temp",temp);
        param.put("userId",userId);
        testMapper.add(param);

    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    @Override
    public void add_2(Long userId,long temp) {
        Map<String, Object> param = new HashMap<>();
        param.put("temp",temp);
        param.put("userId",userId);
        testMapper.add(param);
    }

    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public Map<String, Object> findOrderByOne(Map<String, Object> param) {
        return testMapper.findOrderByOne(param);
    }

    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    public Map<String, Object> findOrderByTwo(Map<String, Object> param) {
        return testMapper.findOrderByTwo(param);
    }


    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    @Override
    public void updateOne(Map<String, Object> param) {
        testMapper.update(param);
    }
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSource)
    @Override
    public void updateTwo(Map<String, Object> param) {
        testMapper.update(param);
    }
}
