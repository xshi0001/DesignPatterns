package design.patterns.structural.adapter.classadapter;

/**
 * Created by geely
 * 类适配器模式-组合
 */
public class Test {
    public static void main(String[] args) {
        // 具体目标实现类
        Target target = new ConcreteTarget();
        target.request();
        Target adapterTarget = new Adapter();
        adapterTarget.request();




    }
}
