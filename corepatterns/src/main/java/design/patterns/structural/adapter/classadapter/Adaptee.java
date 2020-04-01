package design.patterns.structural.adapter.classadapter;

/**
 * Created by geely
 * 被适配者
 * 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
 */
public class Adaptee {
    public void adapteeRequest(){
        System.out.println("被适配者的方法");
    }

}
