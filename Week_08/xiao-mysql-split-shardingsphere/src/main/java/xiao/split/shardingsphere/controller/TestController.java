package xiao.split.shardingsphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import xiao.split.shardingsphere.Service.TestService;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @GetMapping("test")
    public List<Map<String,Object>> test() {
        List<Map<String,Object>> list = testService.findAll();
        System.out.println(list);
        return list;
    }

    @GetMapping("add")
    public String add(@RequestParam("userId") Long userId) {
       testService.add(userId);
        return "长度";
    }

    @GetMapping("select")
    public Map<String,Object> select(@RequestParam("userId") Long userId,@RequestParam("id") Long id) {

        Map<String,Object> param = new HashMap<>();
        param.put("user_id",userId);
        param.put("id",id);
        Map<String,Object>  result = this.testService.findOrder(param);
        return result;
    }

    @GetMapping("edit")
    public String edit(@RequestParam("userId") Long userId,@RequestParam("id") Long id,@RequestParam("order_no") String order_no) {
        Map<String,Object> param = new HashMap<>();
        param.put("user_id",userId);
        param.put("id",id);
        Map<String,Object>  result = this.testService.findOrder(param);
        if(result != null && result.size()> 0) {
            Long type = (Long)result.get("type");
            param.put("type",type);
            param.put("order_no",order_no);
            this.testService.update(param);
        }

        return "长度";
    }
}
