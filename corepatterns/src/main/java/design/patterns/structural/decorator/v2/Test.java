package design.patterns.structural.decorator.v2;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        // 要一个鸡蛋，EggDecorator--》AbstractDecorator---》ABattercake
        aBattercake = new EggDecorator(aBattercake);
        // 再加一个鸡蛋，
        aBattercake = new EggDecorator(aBattercake);
        // 再加一个香肠
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc()+" 销售价格:"+aBattercake.cost());

        System.out.println("如何使用装饰者：\n 如果使用组合关系来创建一个包装对象（即装饰对象）来包裹真实对象，" +
                "\n 并在保持真实对象的类结构不变的前提下，为其提供额外的功能，这就是装饰模式的目标。");

    }
}
