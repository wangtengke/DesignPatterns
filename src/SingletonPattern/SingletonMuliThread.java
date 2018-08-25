package SingletonPattern;

/**
 * @program: DesignPatterns
 * @description: 懒汉式线程安全，同时保证加载延迟
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class SingletonMuliThread {
    private static SingletonMuliThread singletonMuliThread;
    private SingletonMuliThread(){}

    public static synchronized SingletonMuliThread getSingletonMuliThread() {
        if(singletonMuliThread==null){
             singletonMuliThread = new SingletonMuliThread();
        }
        return singletonMuliThread;
    }
}
