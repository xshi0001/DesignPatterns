package com.geely.design.principle.dependenceinversion.v1;


/**
 * Created by geely
 * 应用层（高层模块）-controller
 * 选择学习什么课程
 *
 */
public class Test {

    //v1
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyJavaCourse();
        geely.studyFECourse();
    }





}
