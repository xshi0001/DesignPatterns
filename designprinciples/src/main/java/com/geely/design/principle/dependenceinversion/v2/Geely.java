package com.geely.design.principle.dependenceinversion.v2;

/**
 * 人的行为
 * @author xshi0
 */
public class Geely {


    public void studyImoocCourse(ICourse iCourse) {
        iCourse.studyCourse();
    }

}