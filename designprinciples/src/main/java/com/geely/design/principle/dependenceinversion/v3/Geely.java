package com.geely.design.principle.dependenceinversion.v3;

import com.geely.design.principle.dependenceinversion.v3.ICourse;
import com.geely.design.principle.dependenceinversion.v3.impl.JavaCourse;

/**
 * 人的行为
 *
 * @author xshi0
 */
public class Geely {

    private ICourse iCourse;

    public Geely(ICourse iCourse) {
        this.iCourse = iCourse;
    }

    public void studyImoocCourse() {

        iCourse.studyCourse();
    }

}