package design.patterns.structural.decorator.v2;

/**
 * Created by geely
 * 抽象煎饼，具体的描述和价格并不确定，由客户确定，起到规范的作用！
 * 抽象构件（Component）角色：定义一个抽象接口以规范准备接收附加责任的对象。
 *
 * 接口和抽象类都可以，因为子类只继承一个抽象构件，没有多继承，
 * 这里使用接口也是可以的
 */
public abstract class ABattercake {
    /**
     *
     *  人们希望超类中的某些方法允许被子类访问， 或允许子类的方法访
     * 问超类的某个域。为此， 需要将这些方法或域声明为 protected
     *
     * @return
     */
    protected abstract String getDesc();
    protected abstract int cost();

}
