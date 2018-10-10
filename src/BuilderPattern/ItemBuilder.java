package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description: 真正建造订单的地方
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class ItemBuilder {
    private Item item = new Item();
   public Item createItem(){
       item.addItem(new Cola());
       item.addItem(new Burger());
       item.addItem(new FamilyBucket());
       item.showDisplay();
       return item;
   }
}
