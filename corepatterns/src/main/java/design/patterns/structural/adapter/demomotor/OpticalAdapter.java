package design.patterns.structural.adapter.demomotor;

/**
 * @program: designpatterns
 * @description: 光能适配器
 * @author: JClearLove
 * @Date: 2020/03/25 16:32
 */
public class OpticalAdapter implements TargetMotor {

    private OpticalMotor opticalMotor;

    public OpticalAdapter() {
        opticalMotor = new OpticalMotor();
    }

    /**
     * 统一的发动机驱动方法，能驱动各类发动机
     */
    @Override
    public void driver() {
        opticalMotor.OpticalDriver();

    }
}

