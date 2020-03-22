package com.geely.design.principle.dependenceinversion.v1;

/**
 * @program: designpatterns
 * @description:
 *
 *    底层，有哪些课程学习，课程学习（注册信息、学习资料、上课日期.....)可以抽象定义成接口
 *    每门课程是如何被学习，可以每一个课程去实现“课程”这个抽象概念
 *
 * @author: JClearLove
 * @Date: 2020/03/22 08:04
 */
public class Geely {

    public void studyPythonCourse() {
        System.out.println("Geely在学习Python课程");
    }

    public void studyJavaCourse() {
        System.out.println("Geely在学习Java课程");
    }

    public void studyFECourse() {
        System.out.println("Geely在学习FE课程");
    }
}

