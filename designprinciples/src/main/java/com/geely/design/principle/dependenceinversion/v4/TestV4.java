package com.geely.design.principle.dependenceinversion.v4;

import com.geely.design.principle.dependenceinversion.v4.impl.FECourse;
import com.geely.design.principle.dependenceinversion.v4.impl.JavaCourse;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/22 10:25
 */
public class TestV4 {

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.setiCourse(new JavaCourse());
        geely.studyImoocCourse();
        geely.setiCourse(new FECourse());
        geely.studyImoocCourse();

    }

}

