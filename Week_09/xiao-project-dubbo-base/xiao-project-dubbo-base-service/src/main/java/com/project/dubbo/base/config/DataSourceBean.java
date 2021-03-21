package com.project.dubbo.base.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import com.alibaba.fastjson.JSONObject;
import com.project.dubbo.base.aop.DynamicDataSource;
import com.project.dubbo.base.aop.DynamicDataSourceEnum;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;


@Configuration
public class DataSourceBean {

    private static final ThreadLocal<String> DYNAMIC_DATASOURCE_CONTEXT = new ThreadLocal<>();


    @Bean(name = "dataSource")
    @ConfigurationProperties("spring.datasource")
    public DataSource dataSource(DruidProperties druidProperties){
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setName("dataSource");
        DataSource dataSource1 =druidProperties.dataSource(dataSource);
        System.out.println("ds="+  dataSource1.toString());
        return  dataSource1;
    }

    @Bean(name = "dataSourceSlave")
    @ConfigurationProperties("spring.datasource.slave")
    public DataSource dataSourceSlave(DruidProperties druidProperties){
        DruidDataSource dataSource = DruidDataSourceBuilder.create().build();
        dataSource.setName("dataSourceSlave");
        DataSource dataSource2 = druidProperties.dataSource(dataSource);
        System.out.println("ds2="+ dataSource2.toString());
        return dataSource2;
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


    @Primary
    @Bean(name = "dynamicDataSource")
    @DependsOn({"dataSource","dataSourceSlave"})
    public DynamicDataSource dataSource(DataSource dataSource, DataSource dataSourceSlave) {
        // 数据源
        Map<Object, Object> targetDataSources = new HashMap<>(16);
        targetDataSources.put(DynamicDataSourceEnum.dataSource.getDataSourceName(), dataSource);
        targetDataSources.put(DynamicDataSourceEnum.dataSourceSlave.getDataSourceName(), dataSourceSlave);

        // 路由数据源
        DynamicDataSource multipleDataSource = new DynamicDataSource();
        multipleDataSource.setTargetDataSources(targetDataSources);
        System.out.println("DynamicDataSource="+  multipleDataSource.toString());
        return multipleDataSource;
    }
}

