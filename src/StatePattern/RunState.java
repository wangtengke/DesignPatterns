package StatePattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class RunState implements LiftState {
    @Override
    public void close() {

    }

    @Override
    public void open() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {
        System.out.println("电梯停止了。。。");
    }
}
