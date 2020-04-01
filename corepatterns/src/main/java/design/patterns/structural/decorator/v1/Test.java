package design.patterns.structural.decorator.v1;

/**
 * Created by geely
 */
public class Test {
    public static void main(String[] args) {
        // 点饼
        Battercake battercake = new Battercake();
        System.out.println(battercake.getDesc() + " 销售价格:" + battercake.cost());

        // 点饼+鸡蛋
        Battercake battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.getDesc() + " 销售价格:" + battercakeWithEgg.cost());

        // 点饼+鸡蛋+香肠
        Battercake battercakeWithEggSausage = new BattercakeWithEggSausage();
        System.out.println(battercakeWithEggSausage.getDesc() + " 销售价格:" + battercakeWithEggSausage.cost());


        System.out.println("问题：\n 请问点饼+2个鸡蛋多少钱？？\n 能算吗？扩展性很差！");

    }
}
