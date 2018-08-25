package ObserverPattern;

/**
 * @program: DesignPatterns
 * @description:观察者qqchat
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class QQchatOberser implements Oberser {
    @Override
    public void update(String text) {
        System.out.println(this.getClass().getName()+":"+text);
    }
}
