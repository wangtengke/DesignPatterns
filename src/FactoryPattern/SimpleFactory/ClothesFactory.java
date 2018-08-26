package FactoryPattern.SimpleFactory;

/**
 * @program: DesignPatterns
 * @description: 衣服工厂，决定实例化哪个工厂
 * @author: Mr.Wang
 * @create: 2018-08-26
 **/
public class ClothesFactory {
    private Clothes clothes;
    public Clothes getClothesFactory(String text){
        if(text.equals("T-shirt")){
            TshirtClothes tshirtClothes = new TshirtClothes();
            return tshirtClothes;
        }
        else if(text.equals("sweater")){
            SweaterClothes sweaterClothes = new SweaterClothes();
            return sweaterClothes;
        }
        else if(text.equals("coat")){
            CoatClothes coatClothes = new CoatClothes();
            return coatClothes;
        }
        else {
            System.out.println("no this type");
            return null;
        }

    }

}
