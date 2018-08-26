package FactoryPattern.SimpleFactory;

/**
 * @program: DesignPatterns
 * @description: 简单工厂测试
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class SimpleFactoryMain {
    public static  void main(String[] args){
        ClothesFactory clothesFactory = new ClothesFactory();
        Clothes clothes =clothesFactory.getClothesFactory("coat1");
        clothes.print();

    }
}
