package StatePattern;

/**
 * @program: DesignPatterns
 * @description: 状态机模式测试
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/

public class StateMain {
    public static void main(String[] args){
        Context context = new Context();
        context.setLiftState(Context.openState);
        context.run();
        context.close();
        context.open();
        context.stop();
        context.setLiftState(Context.runState);
        context.run();
        context.close();
        context.open();
        context.stop();
    }
}
