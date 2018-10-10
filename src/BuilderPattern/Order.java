package BuilderPattern;


public interface Order {
    String name();
    FoodType foodType();
    OrderType orderType();
    int price();
}
