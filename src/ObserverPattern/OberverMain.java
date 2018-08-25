package ObserverPattern;

/**
 * @program: DesignPatterns
 * @description: 测试观察者模式代码
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class OberverMain {
    public static void main(String[] args){
        Subject subject = new SubjectImpl();
        Oberser msgOberser = new MsgOberser();
        Oberser wechaOberser = new WechatOberser();
        Oberser qqchatOberser = new QQchatOberser();
        //添加观察者
        subject.addObserver(msgOberser);
        subject.addObserver(wechaOberser);
        subject.addObserver(qqchatOberser);
        subject.notification("第一次收到");
        //移除msg观察者
        subject.removeObserver(msgOberser);
        subject.notification("第二次收到");
    }
}
