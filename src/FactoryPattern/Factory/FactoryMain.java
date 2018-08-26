package FactoryPattern.Factory;

/**
 * @program: DesignPatterns
 * @description: 工厂模式测试
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class FactoryMain {
    public static void main(String[] args){
        CoatFactory coatFactory =new CoatFactory();
        Clothes clothes =coatFactory.createFactory();
        clothes.print();

    }

}
