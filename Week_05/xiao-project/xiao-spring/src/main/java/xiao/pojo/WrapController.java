package xiao.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import xiao.springboot.config.AutoConfiguration;
import xiao.springboot.pojo.Klass;
import xiao.springboot.pojo.School;

@RestController
public class WrapController {
	
	
    @Autowired
    private xiao.springboot.pojo.Klass klass;
    @Autowired
    private xiao.springboot.pojo.Student student;
    @Autowired
    private School school;
    @RequestMapping("/wrap/{param}")
    public void wrapHandler() {
        System.out.println( klass.toString());
        System.out.println( student.toString());
        System.out.println( school.toString());

    }
}

