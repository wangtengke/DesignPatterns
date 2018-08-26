package FactoryPattern.AbstractFactory.ProductImpl;

import FactoryPattern.AbstractFactory.Clothes;

/**
 * @program: DesignPatterns
 * @description:毛衣功能实现
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class SweaterClothes implements Clothes {
    @Override
    public void print() {
        System.out.println("this is sweater");
    }
}
