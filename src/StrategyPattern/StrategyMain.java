package StrategyPattern;

/**
 * @program: DesignPatterns
 * @description: 策略模式测试
 * @author: WangTengKe
 * @create: 2018-09-12
 **/
public class StrategyMain {
    public static void main(String[] args){
        Context context = new Context(new addOperation());
        System.out.println("Result:"+context.doStrategy(5,10));
        Context context1 = new Context(new subOperation());
        System.out.println("Result:"+context1.doStrategy(5,10));
        Context context2 = new Context(new multOperation());
        System.out.println("Result:"+context2.doStrategy(5,10));
    }


}
