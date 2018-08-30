package TemplatePattern;

/**
 * @program: DesignPatterns
 * @description: 模板抽象类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public abstract class Game {
    abstract void start();
    abstract void process();
    abstract void finish();
    public final void play(){
        start();
        process();
        finish();
    }
}
