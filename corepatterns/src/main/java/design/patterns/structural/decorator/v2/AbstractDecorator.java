package design.patterns.structural.decorator.v2;

/**
 * Created by geely
 *
 * 抽象装饰，必须继承抽象构件，且包含一个抽象构件属性
 *
 * 抽象装饰（Decorator）角色：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能
 */
public abstract class AbstractDecorator extends ABattercake {
    /**
     * 抽象煎饼
     */
    private ABattercake aBattercake;

    public AbstractDecorator(ABattercake aBattercake) {
        this.aBattercake = aBattercake;
    }

    /**
     * 装饰修饰的方法
     *  AbstractDecorator 抽象的装饰者，可以不抽象，
     *  如果没有doSomething这个抽象的方法的话，由具体业务决定
     */
    protected abstract void doSomething();

    /**
     * 委托给抽象煎饼完成描述和价格
     * @return
     */
    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
