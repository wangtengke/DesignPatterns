package ProxyPattern.StaticProxy;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class ProxyMain {
    public static void main(String[] args){
        Subject subject = new ProxySubject(new SubjectImpl());
        subject.visit();
    }
}
