package xiao.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.Service.UserService;
import xiao.aop.DynamicDataSourceEnum;
import xiao.aop.MyDatesourcesUrl;
import xiao.mapper.TestMapper;

import java.util.List;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private TestMapper testMapper;
    @Override
    @MyDatesourcesUrl(datesources= DynamicDataSourceEnum.dataSourceSlave)
    public List<Map<String, Object>> findAll() {
        return testMapper.findAll();
    }
}
