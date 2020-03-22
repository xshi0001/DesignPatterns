package com.geely.design.principle.dependenceinversion.v3.impl;

import com.geely.design.principle.dependenceinversion.v3.ICourse;

/**
 * Created by geely
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习FE课程");
    }

}
