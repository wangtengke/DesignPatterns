package FactoryPattern.AbstractFactory.FactoryImpl;

import FactoryPattern.AbstractFactory.AbstractFactory;
import FactoryPattern.AbstractFactory.Clothes;
import FactoryPattern.AbstractFactory.ProductImpl.CoatClothes;
import FactoryPattern.AbstractFactory.Pants;

/**
 * @program: DesignPatterns
 * @description:创建外套工厂
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class CoatClothesFactory implements AbstractFactory {


    @Override
    public Clothes createClothes() {
        return new CoatClothes();
    }

    @Override
    public Pants createPants() {
        return null;
    }
}
