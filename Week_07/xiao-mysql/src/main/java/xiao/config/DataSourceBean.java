package xiao.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import xiao.aop.DynamicDataSource;
import xiao.aop.DynamicDataSourceEnum;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class DataSourceBean {

    private static final ThreadLocal<String> DYNAMIC_DATASOURCE_CONTEXT = new ThreadLocal<>();
    @Bean(name = "dataSource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(DruidProperties druidProperties){
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        return druidProperties.dataSource(dataSource);
    }

    @Bean(name = "dataSourceSlave")
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource dataSourceSlave(DruidProperties druidProperties){
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        return druidProperties.dataSource(dataSource);
    }


    public static void set(String datasourceType){
        DYNAMIC_DATASOURCE_CONTEXT.set(datasourceType);
    }
    public static String get() {
        return DYNAMIC_DATASOURCE_CONTEXT.get();
    }
    public static void clear() {
        DYNAMIC_DATASOURCE_CONTEXT.remove();
    }



    @Bean(name = "dynamicDataSource")
    @Primary
    public DynamicDataSource dataSource(DataSource dataSource, DataSource dataSourceSlave) {
        // 数据源
        Map<Object, Object> targetDataSources = new HashMap<>(16);
        targetDataSources.put(DynamicDataSourceEnum.dataSource.getDataSourceName(), dataSource);
        targetDataSources.put(DynamicDataSourceEnum.dataSourceSlave.getDataSourceName(), dataSourceSlave);

        // 路由数据源
        DynamicDataSource multipleDataSource = new DynamicDataSource();
        multipleDataSource.setTargetDataSources(targetDataSources);
        return multipleDataSource;
    }
}

