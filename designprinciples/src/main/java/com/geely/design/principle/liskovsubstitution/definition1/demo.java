package com.geely.design.principle.liskovsubstitution.definition1;

/**
 * 子类必须实现父类的抽象方法，但不得重写（覆盖）父类的非抽象（已实现）方法。
 * @author xshi0
 */
public class demo {
    public static void main(String[] args){
        System.out.println("父类的运行结果");
        A a=new A();
        a.fun(1,2);
        //父类存在的地方，可以用子类替代
        //子类B替代父类A
        System.out.println("子类替代父类后的运行结果");
        B b=new B();
        b.fun(1,2);
    }
}