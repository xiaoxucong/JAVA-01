package xiao.aop;

import java.lang.annotation.*;

@Target({ ElementType.METHOD, ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface MyDatesourcesUrl {

    DynamicDataSourceEnum datesources() default DynamicDataSourceEnum.dataSourceSlave;

}
