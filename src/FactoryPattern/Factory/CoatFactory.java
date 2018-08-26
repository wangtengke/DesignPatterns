package FactoryPattern.Factory;

/**
 * @program: DesignPatterns
 * @description:
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class CoatFactory implements ClothesFactory {
    @Override
    public Clothes createFactory() {
        return new CoatClothes();
    }
}
