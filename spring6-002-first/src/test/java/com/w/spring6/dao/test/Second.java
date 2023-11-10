package com.w.spring6.dao.test;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Second {

    @Test
    public void textInitBean() {


        new ClassPathXmlApplicationContext("spring6.xml");

        Logger logger= LoggerFactory.getLogger(Second.class);
        logger.info("我是一条信息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");

    }
}
