package com.geely.design.principle.dependenceinversion.v3;

import com.geely.design.principle.dependenceinversion.v3.impl.JavaCourse;

/**
 * @program: designpatterns
 * @description:
 * @author: JClearLove
 * @Date: 2020/03/22 10:12
 */
public class TestV3 {
    public static void main(String[] args) {
        Geely geely = new Geely(new JavaCourse());
        geely.studyImoocCourse();
    }

}

