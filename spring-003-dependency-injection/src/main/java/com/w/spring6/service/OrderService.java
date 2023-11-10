package com.w.spring6.service;

import com.w.spring6.dao.OrderDao;

public class OrderService {
    private OrderDao orderDao;

    // 通过反射机制调用构造方法给属性赋值
    public OrderService(OrderDao orderDao) {
        this.orderDao = orderDao;
    }

    public void delete(){
        orderDao.deleteById();
    }

}
