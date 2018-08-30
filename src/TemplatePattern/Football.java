package TemplatePattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: WangTengKe
 * @create: 2018-08-30
 **/
public class Football extends Game {
    @Override
    void start() {
        System.out.println("football start!");
    }

    @Override
    void process() {
        System.out.println("football is processing");
    }

    @Override
    void finish() {
        System.out.println("football is finished");
    }
}
