package xiao.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import xiao.config.DataSourceBean;

@Aspect
@Order(-1)// 保证该AOP在@Transactional之前执行
@Component
public class DataSourcesAop {



    @Before("@annotation(ds)")
    public void changeDataSource(JoinPoint point, MyDatesourcesUrl ds) throws Throwable {
        String dsId = ds.datesources().getDataSourceName();
        DataSourceBean.set(dsId);
        System.out.println("aop数据="+dsId);
    }

    @After("@annotation(ds)")
    public void restoreDataSource(JoinPoint point, MyDatesourcesUrl ds) {
        DataSourceBean.clear();
    }
}
