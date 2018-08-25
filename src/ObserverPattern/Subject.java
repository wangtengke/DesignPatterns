package ObserverPattern;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
/** 
* @Description: 被观察者抽象类 
* @Param:  
* @return:  
* @Author: Wtk 
* @Date: 2018/8/25 
*/ 
public interface Subject {
    void notification(String text);
    void addObserver(Oberser oberser);
    void removeObserver(Oberser oberser);
}
