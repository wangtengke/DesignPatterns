package FactoryPattern.AbstractFactory.ProductImpl;

import FactoryPattern.AbstractFactory.Pants;

/**
 * @program: DesignPatterns
 * @description:短裤功能实现
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class ShortPants implements Pants {
    @Override
    public void print() {
        System.out.println("this is short");
    }
}
