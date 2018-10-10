package BuilderPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @description: 建造订单
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class Item {
    private List<Order> orders = new ArrayList<>();
    //添加食物项目
    public void addItem(Order order){
        orders.add(order);
    }
    //计算总价格
    public int addPrice(){
        int cost = 0;
        for(Order order:orders){
            cost += order.price();
        }
        return cost;
    }
    //展示结果
    public void showDisplay(){
        for (Order order:orders){
            System.out.println(String.format("result:[orderName:%s,orderType:%s,foodType:%s,orderPrice:%d]",order.name(),order.orderType().OrderType(),order.foodType().FoodType(),order.price()));
        }
        System.out.println(String.format("TotalCost:%d",addPrice()));
    }
}
