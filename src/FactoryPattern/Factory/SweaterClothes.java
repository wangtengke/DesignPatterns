package FactoryPattern.Factory;

/**
 * @program: DesignPatterns
 * @description:
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class SweaterClothes implements Clothes {
    @Override
    public void print() {
        System.out.println("this is sweater");
    }
}
