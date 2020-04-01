package design.patterns.creational.builder.decorationdemo;

/**
 * @program: designpatterns
 * @description: 具体建筑者：建筑装修工人
 * @author: JClearLove
 * @Date: 2020/03/23 15:52
 */
public class ConcreteDecoratorOne extends Decorator {

    @Override
    public void buildWall() {
        product.setWall("white");
    }

    @Override
    public void buildTv() {
        product.setTv("TCL");

    }

    @Override
    public void buildSofa() {
        product.setSofa("ada");

    }
}

