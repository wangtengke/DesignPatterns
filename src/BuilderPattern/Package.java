package BuilderPattern;

/**
 * @program: DesignPatterns
 * @description: 套餐
 * @author: WangTengKe
 * @create: 2018-10-10
 **/
public class Package implements OrderType {
    @Override
    public String OrderType() {
        return "Package";
    }
}
