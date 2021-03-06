package xiao.shardingsphere;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(basePackages = {"xiao.shardingsphere.mapper"} )
public class JdbcApplication {

        public static void main(String[] args) {
            SpringApplication.run(JdbcApplication.class, args);
        }
    }

