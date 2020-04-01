package design.patterns.creational.factorymethod;

/**
 * @program: designpatterns
 * 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/23 12:58
 */
public class FeVideoFatory extends VideoFactory {

    /**
     * 接口和抽象类都可以使用
     *
     * @return
     */
    @Override
    public Video getVideo() {
        return new FeVideo();
    }
}

