package design.patterns.structural.decorator.v1;

/**
 * Created by geely
 *  饼+鸡蛋+香肠
 */
public class BattercakeWithEggSausage extends BattercakeWithEgg {
    @Override
    public String getDesc() {
        return super.getDesc()+ " 加一根香肠";
    }

    @Override
    public int cost() {
        return super.cost()+2;
    }
}
