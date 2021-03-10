package xiao;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * Hello world!
 *
 */
@MapperScan(basePackages = {"xiao.split.mapper"} )
@SpringBootApplication(exclude = {
        DataSourceAutoConfiguration.class
})
public class SplitApplication
{
    public static void main(String[] args) {
        SpringApplication.run(SplitApplication.class, args);
    }
}
