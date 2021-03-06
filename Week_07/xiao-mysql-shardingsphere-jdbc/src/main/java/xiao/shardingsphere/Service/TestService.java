package xiao.shardingsphere.Service;

import java.util.List;
import java.util.Map;

public interface TestService {

    List<Map<String,Object>> findAll();

    void add();
}
