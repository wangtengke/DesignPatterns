package SingletonPattern;

/**
 * @program: DesignPatterns
 * @description: 双重校验锁，既保证线程安全，又保证效率
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class SingletonDCL {
    private static SingletonDCL singletonDCL;
    private SingletonDCL(){}

    public static SingletonDCL getSingletonDCL() {
        //第一次判断为了确定是否是null，如果是null加锁后在判断一次是为了避免在这过程中有另外一个线程已经new了对象
        //因为当new完第一个对象后，以后的第一个if就不会进去了，所以加锁也就不会进行了，加锁只会出现在第一次new的时候
        if(singletonDCL==null){
            synchronized (SingletonDCL.class){
                if(singletonDCL==null){
                    singletonDCL = new SingletonDCL();
                }
            }
        }
        return singletonDCL;
    }
}
