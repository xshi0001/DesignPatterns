package com.geely.design.principle.liskovsubstitution.definition1;

/**
 * @author xshi0
 */
public class B extends A{

    @Override
    public void fun(int a,int b){
        // B继承A，重写A的fun方法
        System.out.println(a+"-"+b+"="+(a-b));
    }
}