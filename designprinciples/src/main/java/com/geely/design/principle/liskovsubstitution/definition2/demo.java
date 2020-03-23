package com.geely.design.principle.liskovsubstitution.definition2;

/**
 *
 * 子类中可以增加自己特有的方法。
 */
public class demo {
    public static void main(String[] args){
        System.out.print("父类的运行结果：");
        A a=new A();
        a.fun(1,2);
        //父类存在的地方，可以用子类替代
        //子类B替代父类A
        System.out.print("子类替代父类后的运行结果：");
        B b=new B();
        b.fun(1,2);
        //子类B的新方法
        b.newFun();
    }
}