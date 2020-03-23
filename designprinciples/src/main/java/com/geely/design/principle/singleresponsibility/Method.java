package com.geely.design.principle.singleresponsibility;

/**
 * Created by geely
 * method 方法层面的单一职责
 */
public class Method {
    private void updateUserInfo(String userName,String address){
        userName = "geely";
        address = "beijing";
    }

    /**
     * @param userName  用户名
     * @param properties 其他信息，可变长度
     */
    private void updateUserInfo(String userName,String... properties){
        userName = "geely";

    }

    private void updateUsername(String userName){
        userName = "geely";
    }
    private void updateUserAddress(String address){
        address = "beijing";
    }

    private void updateUserInfo(String userName,String address,boolean bool){
        if(bool){
            //todo something1
        }else{
            //todo something2
        }


        userName = "geely";
        address = "beijing";
    }


}
