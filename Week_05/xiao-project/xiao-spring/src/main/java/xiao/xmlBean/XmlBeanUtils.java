package xiao.xmlBean;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import xiao.pojo.User;

import java.io.File;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class XmlBeanUtils {



    public static void main(String[] args) throws Exception{

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("user.xml");
        User user1 = (User)applicationContext.getBean("user1");
        User user2 = (User)applicationContext.getBean("user2");
        System.out.println("user1="+user1);
        System.out.println("user2="+user2);
    }
}
