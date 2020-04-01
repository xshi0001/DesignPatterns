package design.patterns.structural.adapter.classadapter;

/**
 *  具体实现目标
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
