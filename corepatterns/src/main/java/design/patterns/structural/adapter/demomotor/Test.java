package design.patterns.structural.adapter.demomotor;


/**
 * @program: designpatterns
 * @description: 客户端代码
 * @author: JClearLove
 * @Date: 2020/03/25 16:48
 */
public class Test {
    public static void main(String[] args) {
        System.out.println("适配器模式测试：");
        TargetMotor motor = (TargetMotor) ReadXML.getObject();
        if (motor != null) {
            motor.driver();
        }
    }

}

