package com.geely.design.principle.dependenceinversion.v3.impl;

import com.geely.design.principle.dependenceinversion.v3.ICourse;

/**
 * Created by geely
 */
public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习Python课程");
    }
}
