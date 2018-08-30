package ProxyPattern.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * @program: DesignPatterns
 * @description: 动态代理测试类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class DnamicProxyMain {
    public static void main(String[] args){
        Subject subject=  new SubjectImpl();
        DnamicProxySubject dnamicProxySubject = new DnamicProxySubject(subject);
        ClassLoader classLoader = subject.getClass().getClassLoader();
        Subject result = (Subject) Proxy.newProxyInstance(classLoader,new Class[]{Subject.class},dnamicProxySubject);
        result.visit();
    }
}
