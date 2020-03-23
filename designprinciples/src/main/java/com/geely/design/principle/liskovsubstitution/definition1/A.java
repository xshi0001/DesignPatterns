package com.geely.design.principle.liskovsubstitution.definition1;

/**
 * @author xshi0
 *
 */
public class A {
    // A定义了方法fun，fun是非抽象方法
    public void fun(int a,int b){
        System.out.println(a+"+"+b+"="+(a+b));
    }
}
 
