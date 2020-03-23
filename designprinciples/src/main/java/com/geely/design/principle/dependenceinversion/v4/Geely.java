package com.geely.design.principle.dependenceinversion.v4;


/**
 * 人的行为, 人的能力，学习课的能力
 * Geely是一个service层，调用dao层的接口
 *
 * @author xshi0
 */
public class Geely {


    private ICourse iCourse;

    public void studyImoocCourse() {
        // 调用接口方法，无需关注实现类是什么
        iCourse.studyCourse();
    }

    public void setiCourse(ICourse iCourse) {
        // 用iCourse的实现类来赋值
        this.iCourse = iCourse;
    }


}