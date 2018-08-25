package SingletonPattern;

/**
 * @program: DesignPatterns
 * @description: 单例测试
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class SingletonMain {
    public static void main(String[] args){
        Singleton singleton = Singleton.getSingle();
        SingletonEnum.INSTANCE.print();
    }
}
