package StatePattern;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;


/**
 * @program: DesignPatterns
 * @description: 状态对应动作类
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class Context {
    //状态
    public static CloseState closeState = new CloseState();
    public static OpenState openState = new OpenState();
    public static RunState runState = new RunState();
    public static StopState stopState = new StopState();

    private LiftState liftState;
    //动作

    public void open(){
        this.liftState.open();
    }
    public void close(){
        this.liftState.close();
    }
    public void run(){
        this.liftState.run();
    }
    public void stop(){
        this.liftState.stop();
    }
    //设置当前状态
    public void setLiftState(LiftState liftState) {
        this.liftState = liftState;
    }
}
