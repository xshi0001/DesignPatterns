package design.patterns.structural.adapter.objectadapter;

/**
 * Created by geely
 * 适配器方法
 */
public class Adapter implements Target{

    /**
     * 引入被适配对象
     */
    private Adaptee adaptee = new Adaptee();

    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
