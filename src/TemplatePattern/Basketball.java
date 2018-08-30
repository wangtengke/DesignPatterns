package TemplatePattern;

/**
 * @program: DesignPatterns
 * @description: 篮球类
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class Basketball extends Game {

    @Override
    void start() {
        System.out.println("basketball start!");
    }

    @Override
    void process() {
        System.out.println("basketball is processing");
    }

    @Override
    void finish() {
        System.out.println("basketball is finished");
    }
}
