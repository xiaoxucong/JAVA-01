package xiao.split.mapper;

import java.util.List;
import java.util.Map;

public interface TestMapper {

    List<Map<String, Object>> findAll();

    void add(Map<String, Object> param);

    Map<String, Object> findOrderByOne(Map<String, Object> param);
    Map<String, Object> findOrderByTwo(Map<String, Object> param);

    void update(Map<String, Object> param);
}
