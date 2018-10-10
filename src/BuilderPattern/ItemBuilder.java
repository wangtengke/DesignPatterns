package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description: 建造订单
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class ItemBuilder {
    private Item item = new Item();
   public Item createItem(){
       item.addItem(new Cola());
       item.addItem(new Burger());
       item.addPrice();
       item.showDisplay();
       return item;
   }
}
