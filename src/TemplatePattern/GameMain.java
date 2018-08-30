package TemplatePattern;

/**
 * @program: DesignPatterns
 * @description: 测试类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class GameMain {
    public static void main(String[] args){
        Game football = new Football();
        //play()是公共方法，在父类Game中直接实现，所有子类都可以直接调用
        football.play();
        Game basketball = new Basketball();
        basketball.play();
    }
}
