package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description: 全家桶
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class FamilyBucket implements Order {
    @Override
    public String name() {
        return "FamilyBucket";
    }

    @Override
    public FoodType foodType() {
        return new Meal();
    }

    @Override
    public OrderType orderType() {
        return new Package();
    }

    @Override
    public int price() {
        return 100;
    }
}
