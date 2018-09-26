package com.itlxw.xwutils.domian;

import java.io.Serializable;

/**
 * Created by on 2018-09-26 14 54.
 * Author  LiuXingWen
 */

public class UserBean implements Serializable{
    //用户名
    private String UserName;
    //用户密码
    private String PassWord;
    //用户id
    private String UserId;

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }
}
