package design.patterns.structural.adapter.demomotor;

/**
 * @program: designpatterns
 * @description: 电能适配器
 * @author: JClearLove
 * @Date: 2020/03/25 16:28
 */
public class ElectricAdapter  implements  TargetMotor{
    private ElectricMotor electricMotor;

    public ElectricAdapter() {
       electricMotor = new ElectricMotor();
    }

    /**
     * 统一的发动机驱动方法，能驱动各类发动机
     */
    @Override
    public void driver() {
        electricMotor.electricDriver();


    }
}

