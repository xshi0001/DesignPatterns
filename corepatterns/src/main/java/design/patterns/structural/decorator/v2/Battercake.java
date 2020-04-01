package design.patterns.structural.decorator.v2;

/**
 * Created by geely
 * 要被装饰的实体类，实现抽象构件，准备被装饰者追加一些职责
 * 具体构件（Concrete    Component）角色：实现抽象构件，通过装饰角色为其添加一些职责。
 */
public class Battercake extends ABattercake {
    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}
