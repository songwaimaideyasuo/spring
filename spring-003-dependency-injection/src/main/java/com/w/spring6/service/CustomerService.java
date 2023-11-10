package com.w.spring6.service;

import com.w.spring6.dao.UserDao;
import com.w.spring6.dao.VipDao;

public class CustomerService {

    public UserDao userDao;
    public VipDao vipDao;

    public CustomerService(UserDao userDao, VipDao vipDao) {
        this.userDao = userDao;
        this.vipDao = vipDao;
    }

    public void save(){
        userDao.insert();
        vipDao.insert();

    }
}
