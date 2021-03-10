package xiao.split.service;

import java.util.List;
import java.util.Map;

public interface TestService {

    List<Map<String,Object>> findAll();

    void add_1(Long userId,long temp);

    void add_2(Long userId,long temp);
    Map<String, Object> findOrderByOne(Map<String, Object> param);
    Map<String, Object> findOrderByTwo(Map<String, Object> param);

    void updateOne(Map<String, Object> param);

    void updateTwo(Map<String, Object> param);
}
