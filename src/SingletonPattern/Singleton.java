package SingletonPattern;

/**
 * @program: DesignPatterns
 * @description: 单例模式-饿汉式
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class Singleton {
    //new一个对象，是唯一的对象
    private static Singleton single = new Singleton();
    //构造函数private，在其他类中无法调用，所以不能new对象，保证只有一个对象
    private Singleton(){
        System.out.println("lazy singleton");
    };
    //供其他接口访问的，得到该对象的方法
    public static Singleton getSingle() {
        return single;
    }
}
