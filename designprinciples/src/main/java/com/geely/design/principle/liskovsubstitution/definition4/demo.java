package com.geely.design.principle.liskovsubstitution.definition4;

import java.util.HashMap;

/**
 * 在父类方法没有被重写的情况下，子方法被执行了，这样就引起了程序逻辑的混乱。
 * 所以子类中方法的前置条件必须与父类中被覆写的方法的前置条件相同或者更宽松。不符合里式替换
 */
public class demo {
    public static void main(String[] args) {
        System.out.print("父类的运行结果：");
        A a = new A();
        HashMap map = new HashMap();
        a.fun(map);
        //父类存在的地方，都可以用子类替代
        //子类B替代父类A
        System.out.print("子类替代父类后的运行结果：");
        B b = new B();
        b.fun(map);
    }
}