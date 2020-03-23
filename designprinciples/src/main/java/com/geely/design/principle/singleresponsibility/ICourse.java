package com.geely.design.principle.singleresponsibility;

/**
 * Created by geely
 */
public interface ICourse {
    // 获取课程信息功能
    String getCourseName();
    byte[] getCourseVideo();

    // 课程维护功能
    void studyCourse();
    void refundCourse();

}
