package xiao.split.aop;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    public Object determineCurrentLookupKey() {
                System.out.println("AbstractRoutingDataSource=动态数据源切换="+DataSourceBean.get());
       return DataSourceBean.get();
    }

}