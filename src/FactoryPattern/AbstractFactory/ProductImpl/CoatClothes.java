package FactoryPattern.AbstractFactory.ProductImpl;

import FactoryPattern.AbstractFactory.Clothes;

/**
 * @program: DesignPatterns
 * @description:外套类功能实现
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class CoatClothes implements Clothes {
    @Override
    public void print() {
        System.out.println("this is coat");
    }
}
