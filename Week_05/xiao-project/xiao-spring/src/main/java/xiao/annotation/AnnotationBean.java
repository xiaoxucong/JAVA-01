package xiao.annotation;


import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import xiao.pojo.User;



public class AnnotationBean {


    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("xiao.pojo");
        User us =  applicationContext.getBean("user",User.class);
        System.out.println(us);
    }


}
