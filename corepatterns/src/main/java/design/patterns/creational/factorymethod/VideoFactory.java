package design.patterns.creational.factorymethod;


/**
 * Created by geely
 * 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
 */
public abstract class VideoFactory {

    /**
     * 接口和抽象类都可以使用
     *
     * @return
     */
    public abstract Video getVideo();

}
