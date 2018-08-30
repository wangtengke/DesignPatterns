package ProxyPattern.DynamicProxy;

import ObserverPattern.Oberser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @program: DesignPatterns
 * @description: 动态代理类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class DnamicProxySubject implements InvocationHandler {
    private Object object;

    public DnamicProxySubject(Object object){
        this.object = object;
    }

    /**
    * @Description:
    * @Param: [proxy, method, args]
    * @return: java.lang.Object
    * @Author: Wtk
    * @Date: 2018/8/30
    */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object , args);
    }
}
