package xiao.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.Service.TestService;
import xiao.aop.DynamicDataSourceEnum;
import xiao.aop.MyDatesourcesUrl;
import xiao.mapper.TestMapper;

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
}
