package com.geely.design.principle.singleresponsibility.impl;

import com.geely.design.principle.singleresponsibility.ICourseContent;
import com.geely.design.principle.singleresponsibility.ICourseManager;

/**
 * Created by geely
 */
public class CourseImpl implements ICourseManager, ICourseContent {
    @Override
    public void studyCourse() {

    }

    @Override
    public void refundCourse() {

    }

    @Override
    public String getCourseName() {
        return null;
    }

    @Override
    public byte[] getCourseVideo() {
        return new byte[0];
    }
}
