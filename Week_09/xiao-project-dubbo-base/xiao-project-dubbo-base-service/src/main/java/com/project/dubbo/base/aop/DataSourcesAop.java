package com.project.dubbo.base.aop;

import com.project.dubbo.base.config.DataSourceBean;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Order(-1)// 保证该AOP在@Transactional之前执行
@Component
public class DataSourcesAop {


    @Pointcut("execution(* com.project.dubbo.base.service.*.*(..))")
    public void executeService() {
    }

    @Before("executeService()")//("@annotation(ds)")
    public void changeDataSource(JoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        MyDatesourcesUrl ds = method.getAnnotation(MyDatesourcesUrl.class);

        if(ds != null ) {
            String dsId = ds.datesources().getDataSourceName();
            System.out.println("数据库="+dsId);
            DataSourceBean.set(dsId);
        }else {
            System.out.println("默认数据库="+DynamicDataSourceEnum.dataSource.getDataSourceName());
            DataSourceBean.set(DynamicDataSourceEnum.dataSource.getDataSourceName());
        }
    }

    @After("executeService()")//("@annotation(ds)") , MyDatesourcesUrl ds
    public void restoreDataSource(JoinPoint point) {
        System.out.println("清除数据库");
        DataSourceBean.clear();
    }
}
