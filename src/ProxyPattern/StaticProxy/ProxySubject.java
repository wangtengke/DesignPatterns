package ProxyPattern.StaticProxy;

import jdk.nashorn.internal.objects.annotations.Constructor;
import sun.reflect.CallerSensitive;

/**
 * @program: DesignPatterns
 * @description: 代理类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/

public class ProxySubject implements Subject {
    private Subject subject;
    public ProxySubject(Subject subject){
        //得到实现类
        this.subject = subject;
    }
    @Override
    public void visit() {
        //访问实现类的visit的方法
        subject.visit();
    }
}
