package com.geely.design.principle.liskovsubstitution.definition4;

import java.util.Map;

public class A {
    public void fun(Map map){
        System.out.println("父类被执行...");
    }
}