package xiao.shardingsphere.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.shardingsphere.Service.TestService;
import xiao.shardingsphere.mapper.TestMapper;

import java.util.List;
import java.util.Map;

@Service
public class TestServiceImpl implements TestService {
    @Autowired
    private TestMapper testMapper;
    @Override
    public List<Map<String, Object>> findAll() {
        return testMapper.findAll();
    }

    @Override
    public void add() {
        testMapper.add();
    }
}
