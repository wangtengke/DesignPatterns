package StrategyPattern;

/**
 * @program: DesignPatterns
 * @description: 策略接口
 * @author: WangTengKe
 * @create: 2018-09-12
 **/
public class Context {
    private Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int doStrategy(int num1 , int num2){
        return strategy.calculation(num1 , num2);
    }
}
