package com.geely.design.principle.dependenceinversion.v4.impl;

import com.geely.design.principle.dependenceinversion.v4.ICourse;

/**
 * Created by geely
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
