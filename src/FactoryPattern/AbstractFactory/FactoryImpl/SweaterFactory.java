package FactoryPattern.AbstractFactory.FactoryImpl;

import FactoryPattern.AbstractFactory.AbstractFactory;
import FactoryPattern.AbstractFactory.Clothes;
import FactoryPattern.AbstractFactory.Pants;
import FactoryPattern.AbstractFactory.ProductImpl.SweaterClothes;

/**
 * @program: DesignPatterns
 * @description:创建毛衣工厂
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class SweaterFactory implements AbstractFactory {
    @Override
    public Clothes createClothes() {
        return new SweaterClothes();
    }

    @Override
    public Pants createPants() {
        return null;
    }
}
