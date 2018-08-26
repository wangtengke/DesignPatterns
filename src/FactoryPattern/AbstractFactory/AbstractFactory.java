package FactoryPattern.AbstractFactory;

/**
 * @program: DesignPatterns
 * @description: 抽象工厂
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public interface AbstractFactory {
    Clothes createClothes();
    Pants createPants();
}
