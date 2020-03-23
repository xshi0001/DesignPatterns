package com.geely.design.principle.liskovsubstitution.definition3;

import java.util.HashMap;
import java.util.Map;

public class LSP1 {
    abstract class A {
        public abstract Map fun();
    }

    class B extends A {
        @Override
        public HashMap fun() {
            HashMap b = new HashMap();
            b.put("b", "子类被执行...");
            return b;
        }
    }

    public static void main(String[] args) {
        LSP1 lsp = new LSP1();
        LSP1.A a = lsp.new B();
        System.out.println(a.fun());
    }

}