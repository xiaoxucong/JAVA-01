package xiao.springboot.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import xiao.springboot.pojo.Klass;
import xiao.springboot.pojo.School;
import xiao.springboot.pojo.Student;

/**
 * @description
 */
@Configuration
@ConditionalOnClass({Student.class,Klass.class,School.class})
public class AutoConfiguration {

    @Bean
    @ConditionalOnMissingBean  //容器中没有实例才会创建
    public Student customerStudent() {
        return new Student();
    }

    @Bean
    @ConditionalOnMissingBean  //容器中没有实例才会创建
    public Klass customerKlass() {
        return new Klass();
    }
    @Bean
    @ConditionalOnMissingBean  //容器中没有实例才会创建
    public School customerSchool() {
        return new School();
    }
}
