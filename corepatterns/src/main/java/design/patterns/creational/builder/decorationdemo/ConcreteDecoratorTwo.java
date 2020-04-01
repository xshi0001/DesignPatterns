package design.patterns.creational.builder.decorationdemo;

/**
 * @program: designpatterns
 * @description: 具体装修工人：建筑装修工人
 * @author: JClearLove
 * @Date: 2020/03/23 15:55
 */
public class ConcreteDecoratorTwo extends Decorator {

    @Override
    public void buildWall() {
        product.setWall("white");
    }

    @Override
    public void buildTv() {
        product.setTv("xiaomi");
    }

    @Override
    public void buildSofa() {
        product.setSofa("bab");
    }
}

