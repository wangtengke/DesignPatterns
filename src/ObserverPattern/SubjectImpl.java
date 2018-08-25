package ObserverPattern;

import java.util.LinkedList;
import java.util.List;

/**
 * @program: DesignPatterns
 * @description:被观察者具体实现的功能
 * @author: Mr.Wang
 * @create: 2018-08-25
 **/
public class SubjectImpl implements Subject {
    private List<Oberser> obersers= new LinkedList<>();
    @Override
    public void notification(String text) {
        for(Oberser oberser: obersers){
            oberser.update(text);
        }
    }

    @Override
    public void addObserver(Oberser oberser) {
        obersers.add(oberser);
    }

    @Override
    public void removeObserver(Oberser oberser) {
        obersers.remove(oberser);
    }
}
