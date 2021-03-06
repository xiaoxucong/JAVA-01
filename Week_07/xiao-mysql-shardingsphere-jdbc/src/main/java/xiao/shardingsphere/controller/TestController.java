package xiao.shardingsphere.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.shardingsphere.Service.TestService;

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
    public String add() {
         testService.add();
        return "测试";
    }

}
