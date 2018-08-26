package FactoryPattern.AbstractFactory.ProductImpl;

import FactoryPattern.AbstractFactory.Pants;

/**
 * @program: DesignPatterns
 * @description:长裤功能实现
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class TrouserPants implements Pants {
    @Override
    public void print() {
        System.out.println("this is trouser");
    }
}
