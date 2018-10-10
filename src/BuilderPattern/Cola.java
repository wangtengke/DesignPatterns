package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: WangTengKe
 * @create: 2018-10-10
 **/

public class Cola implements Order {
    @Override
    public String name() {
        return "Cola";
    }

    @Override
    public FoodType foodType() {
        return new Drink();
    }

    @Override
    public OrderType orderType() {
        return new Singleton();
    }

    @Override
    public int price() {
        return 10;
    }
}
