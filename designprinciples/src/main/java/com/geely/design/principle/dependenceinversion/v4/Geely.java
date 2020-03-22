package com.geely.design.principle.dependenceinversion.v4;


/**
 * 人的行为, 人的能力，学习课的能力
 *
 * @author xshi0
 */
public class Geely {


    private ICourse iCourse;


    public void studyImoocCourse() {
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }


}