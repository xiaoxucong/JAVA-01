package xiao.shardingsphere.atomikos.mapper;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Map<String, Object>> findAll();

    void addsd(Map<String, Object> param);

    Map<String, Object> findOrder(Map<String, Object> param);

    void update(Map<String, Object> param);


}
