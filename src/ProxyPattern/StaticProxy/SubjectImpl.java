package ProxyPattern.StaticProxy;

/**
 * @program: DesignPatterns
 * @description: 实现类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class SubjectImpl implements Subject {
    private String msg = "realSubject";
    @Override
    public void visit() {
        System.out.println(msg);
    }
}
