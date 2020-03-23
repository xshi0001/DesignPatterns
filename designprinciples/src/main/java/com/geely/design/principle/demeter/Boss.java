package com.geely.design.principle.demeter;


/**
 * Created by geely
 *  查询课程总数
 */
public class Boss {

    public void commandCheckNumber(TeamLeader teamLeader){
        // Boss 无需知道Course类
        teamLeader.checkNumberOfCourses();
    }

}
