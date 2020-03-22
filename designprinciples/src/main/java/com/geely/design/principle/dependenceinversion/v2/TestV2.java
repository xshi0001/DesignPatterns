package com.geely.design.principle.dependenceinversion.v2;

import com.geely.design.principle.dependenceinversion.v2.impl.FECourse;
import com.geely.design.principle.dependenceinversion.v2.impl.JavaCourse;
import com.geely.design.principle.dependenceinversion.v2.impl.PythonCourse;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/22 08:43
 */
public class TestV2 {

    //v2
    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.studyImoocCourse(new JavaCourse());
        geely.studyImoocCourse(new FECourse());
        geely.studyImoocCourse(new PythonCourse());
    }

}

