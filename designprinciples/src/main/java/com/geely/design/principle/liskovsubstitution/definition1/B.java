package com.geely.design.principle.liskovsubstitution.demo;

public class B extends A{
    @Override
    public void fun(int a,int b){
        System.out.println(a+"-"+b+"="+(a-b));
    }
}