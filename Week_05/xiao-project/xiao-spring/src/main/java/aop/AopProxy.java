package aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class AopProxy  {
    public Object createProxy(Object proxiedObject) {
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        DynamicProxyHandler handler = new DynamicProxyHandler(proxiedObject);
        return Proxy.newProxyInstance(proxiedObject.getClass().getClassLoader(), interfaces, handler);
    }


    class DynamicProxyHandler implements InvocationHandler {
        private Object target;
        public DynamicProxyHandler(Object target) {
            this.target = target;
        }
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println("befor .....  ");
            Object result = method.invoke(target, args);
            String apiName = target.getClass().getName() + ":" + method.getName();
            System.out.println("After .....   apiName="+apiName);
            return result;
        }
    }
}
