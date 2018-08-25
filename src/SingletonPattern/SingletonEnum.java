package SingletonPattern;

/**
 * @program: DesignPatterns
 * @description: 单例枚举方式
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public enum SingletonEnum {
    //单例
    INSTANCE;
    public void print(){
        System.out.println("enum singleton");
    }
}
