package StatePattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class StopState implements LiftState {
    @Override
    public void close() {

    }

    @Override
    public void open() {
        System.out.println("电梯打开了。。。");
    }

    @Override
    public void run() {
        System.out.println("电梯启动了。。。");
    }

    @Override
    public void stop() {

    }
}
