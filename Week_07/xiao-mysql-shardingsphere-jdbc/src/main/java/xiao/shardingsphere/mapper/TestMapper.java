package xiao.shardingsphere.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;


@Mapper
@Repository
public interface TestMapper {

    @Select("select * from t1")
    List<Map<String, Object>> findAll();
    @Insert("insert into     t1 value (100)")
    void add();
}
