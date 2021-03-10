package xiao.split.aop;

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

    @Pointcut("execution(* xiao.split.service.*.*(..))")
    public void source(){};

    @Before("source()")//("@annotation(ds)")
    public void changeDataSource(JoinPoint point) throws Throwable {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        MyDatesourcesUrl ds =method.getAnnotation(MyDatesourcesUrl.class);
        if(ds != null) {
            String dsId = ds.datesources().getDataSourceName();
            DataSourceBean.set(dsId);
            System.out.println("aop数据="+dsId);
        }else {
            DataSourceBean.set(DynamicDataSourceEnum.dataSource.getDataSourceName());
        }

    }

    @After("source()")//("@annotation(ds)")
    public void restoreDataSource(JoinPoint point) {
        MethodSignature signature = (MethodSignature) point.getSignature();
        Method method = signature.getMethod();
        MyDatesourcesUrl ds =method.getAnnotation(MyDatesourcesUrl.class);
        DataSourceBean.clear();
    }
}
