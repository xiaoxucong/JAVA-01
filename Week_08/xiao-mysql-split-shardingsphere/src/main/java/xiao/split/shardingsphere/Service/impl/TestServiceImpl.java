package xiao.split.shardingsphere.Service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xiao.split.shardingsphere.Service.TestService;
import xiao.split.shardingsphere.mapper.TestMapper;

import java.util.HashMap;
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
    public void add(Long userId) {
        Map<String, Object> param = new HashMap<>();
        param.put("user_id",userId);
        testMapper.addsd(param);

    }


    @Override
    public Map<String, Object> findOrder(Map<String, Object> param) {
        return testMapper.findOrder(param);
    }


    @Override
    public void update(Map<String, Object> param) {
        testMapper.update(param);
    }
}
