package design.patterns.structural.adapter.demomotor;

/**
 * @program: designpatterns
 * @description: 目标发动机驱动
 * @author: JClearLove
 * @Date: 2020/03/25 16:21
 */
public interface TargetMotor {
    /**
     *  统一的发动机驱动方法，能驱动各类发动机
     */
    void driver();
}

