package ObserverPattern;

/**
 * @program: DesignPatterns
 * @description:观察者wechat
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class WechatOberser implements Oberser {
    @Override
    public void update(String text) {
        System.out.println(this.getClass().getName()+":"+text);
    }
}
