package StatePattern;

/**
 * @program: DesignPatterns
 * @description:
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class OpenState implements LiftState {
    @Override
    public void close() {
        System.out.println("电梯关闭了。。。");
    }

    @Override
    public void open() {

    }

    @Override
    public void run() {

    }

    @Override
    public void stop() {

    }
}
