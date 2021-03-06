package xiao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.Service.TestService;
import xiao.Service.UserService;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    @Autowired
    private TestService testService;
    @Autowired
    private UserService userService;
    @GetMapping("test")
    public List<Map<String,Object>> test() {
        List<Map<String,Object>> list = testService.findAll();
        System.out.println(list);
        return list;
    }
    @GetMapping("user")
    public List<Map<String,Object>> user() {
        List<Map<String,Object>> list = userService.findAll();
        System.out.println(list);
        return list;
    }
}
