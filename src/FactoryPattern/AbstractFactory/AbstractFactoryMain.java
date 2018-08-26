package FactoryPattern.AbstractFactory;

import FactoryPattern.AbstractFactory.FactoryImpl.CoatClothesFactory;
import FactoryPattern.AbstractFactory.FactoryImpl.ShortFactory;
import FactoryPattern.AbstractFactory.ProductImpl.ShortPants;

/**
 * @program: DesignPatterns
 * @description: 抽象工厂测试
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class AbstractFactoryMain {
    public static void main(String[] args){
        //创建外套工厂
        CoatClothesFactory coatClothesFactory =  new CoatClothesFactory();
       //新建外套类
        Clothes coatClothes = coatClothesFactory.createClothes();
        //实现外套类的方法
        coatClothes.print();

        ShortFactory shortFactory = new ShortFactory();
        Pants shortPants = shortFactory.createPants();
        //实现短裤类的方法
        shortPants.print();
    }
}
