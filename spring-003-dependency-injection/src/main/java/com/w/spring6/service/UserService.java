package com.w.spring6.service;

import com.w.spring6.dao.UserDao;
import com.w.spring6.dao.VipDao;

public class UserService {

    private UserDao userDao;
    private VipDao vipDao;

//    public void setAbc(VipDao vipDao){
//        this.vipDao=vipDao;
//    }

    public void setVipDao(VipDao vipDao){
        this.vipDao=vipDao;
    }

    //set注入的话，必须提供一个set方法
    //spring容器会调用这个set方法，来给userDao赋值
/*    //自己写的不符合javabean规范
    public void setMySQLUserDao(UserDao xyz){
        this.userDao=xyz;
    }*/

    //idea自动生成的符合javabean规范
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void saveUser(){
        userDao.insert();
        vipDao.insert();

    }


}
