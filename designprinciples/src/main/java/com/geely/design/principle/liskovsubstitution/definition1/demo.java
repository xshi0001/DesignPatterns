package com.geely.design.principle.liskovsubstitution.demo;

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