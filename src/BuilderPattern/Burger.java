package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description: 汉堡
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class Burger implements Order {
    @Override
    public String name() {
        return "Burger";
    }

    @Override
    public FoodType foodType() {
        return new Meal();
    }

    @Override
    public OrderType orderType() {
        return new Singleton();
    }

    @Override
    public int price() {
        return 15;
    }
}
