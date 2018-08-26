package FactoryPattern.AbstractFactory.FactoryImpl;

import FactoryPattern.AbstractFactory.AbstractFactory;
import FactoryPattern.AbstractFactory.Clothes;
import FactoryPattern.AbstractFactory.Pants;
import FactoryPattern.AbstractFactory.ProductImpl.ShortPants;

/**
 * @program: DesignPatterns
 * @description:创建短裤工厂
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class ShortFactory implements AbstractFactory {
    @Override
    public Clothes createClothes() {
        return null;
    }

    @Override
    public Pants createPants() {
        return new ShortPants();
    }
}
