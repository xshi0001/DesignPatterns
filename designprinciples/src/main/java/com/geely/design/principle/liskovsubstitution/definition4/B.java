package com.geely.design.principle.liskovsubstitution.definition4;

import java.util.HashMap;
public class B extends A{


    /**
     * @param map 将子类方法的参数范围缩小会怎样？
     */
    public void fun(HashMap map){
        System.out.println("子类被执行...");
    }
}