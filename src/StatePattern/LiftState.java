package StatePattern;

/**
 * @program: DesignPatterns
 * @description: 电梯状态抽象类
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public interface LiftState {
    void close();
    void open();
    void run();
    void stop();
}
