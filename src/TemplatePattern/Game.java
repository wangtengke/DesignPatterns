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
    /**
    * @Description: 模版方法
    * @Param: []
    * @return: void
    * @Author: Wtk
    * @Date: 2018/8/30
    */
    public final void play(){
        start();
        process();
        finish();
    }
}
