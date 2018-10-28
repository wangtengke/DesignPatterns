package ProxyPattern.DynamicProxy;

import ObserverPattern.Oberser;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
    public Object getDnamicProxy(){
        ClassLoader classLoader = object.getClass().getClassLoader();

        Object result = Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},this);
        return result;
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
        System.out.println("DnamicProxy start");
        Object result= method.invoke(object , args);
        System.out.println("DnamicProxy finish");
        return result;
    }
}
