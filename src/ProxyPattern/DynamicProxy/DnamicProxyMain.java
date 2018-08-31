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
        //目标对象
        Subject subject=  new SubjectImpl();
        //动态创建代理对象，将目标对象传入
        DnamicProxySubject dnamicProxySubject = new DnamicProxySubject(subject);
        Subject subject1 = (Subject) dnamicProxySubject.getDnamicProxy();
        //访问目标对象方法
        subject1.visit();
    }
}
