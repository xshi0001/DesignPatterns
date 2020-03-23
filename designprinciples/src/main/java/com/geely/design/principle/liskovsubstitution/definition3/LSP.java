package com.geely.design.principle.liskovsubstitution.definition3;

import java.util.HashMap;
import java.util.Map;

/**
 * 当子类覆盖或实现父类的方法时，方法的前置条件（即方法的形参）要比父类方法的输入参数更宽松。
 *
 * @author xshi0
 */
public class LSP {


    class A {
        public void fun(HashMap map) {
            System.out.println("父类被执行...");
        }
    }

    class B extends A {
        // 子类并非重写了父类的方法，而是重载了父类的方法。因为子类和父类的方法的输入参数是不同的。
        // 子类方法的参数Map比父类方法的参数HashMap的范围要大，所以当参数输入为HashMap类型时，
        // 只会执行父类的方法，不会执行父类的重载方法。
        // 这符合里氏替换原则。
        public void fun(Map map) {
            System.out.println("子类被执行...");
        }
    }

    public static void main(String[] args) {
        System.out.print("父类的运行结果：");
        LSP lsp = new LSP();
        LSP.A a = lsp.new A();
        HashMap<Object, Object> map = new HashMap<Object, Object>();
        a.fun(map);
        //父类存在的地方，可以用子类替代
        //子类B替代父类A
        System.out.print("子类替代父类后的运行结果：");
        LSP.B b = lsp.new B();
        b.fun(map);
    }

}