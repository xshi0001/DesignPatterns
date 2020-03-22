package com.geely.design.principle.dependenceinversion.v2.impl;

import com.geely.design.principle.dependenceinversion.v2.ICourse;

/**
 * Created by geely
 *
 * 面向接口编程与面向实现编程
 *
 */
public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Java课程");
    }
}
