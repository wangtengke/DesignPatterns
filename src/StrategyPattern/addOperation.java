package StrategyPattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: WangTengKe
 * @create: 2018-09-12
 **/
public class addOperation implements Strategy {
    @Override
    public int calculation(int num1, int num2) {
        return num1 + num2;
    }
}
