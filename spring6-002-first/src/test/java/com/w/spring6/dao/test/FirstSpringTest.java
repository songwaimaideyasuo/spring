package com.w.spring6.dao.test;

import com.w.spring6.dao.bean.User;
import com.w.spring6.dao.dao.UserDaoImplForMySQL;
import org.apache.log4j.BasicConfigurator;
import org.junit.jupiter.api.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import java.text.SimpleDateFormat;


public class FirstSpringTest {

    @Test
    public void textBeginInitBean() {

        BasicConfigurator.configure();

        new ClassPathXmlApplicationContext("spring.xml");

        Logger logger= LoggerFactory.getLogger(FirstSpringTest.class);
        logger.info("我是一条信息");
        logger.debug("我是一条调试信息");
        logger.error("我是一条错误信息");

    }


    @Test
    public void testBeanFactory(){
        //ApplicationContext接口的超级父接口是：BeanFactory（Bean工厂）
        //spring底层Ioc是怎么实现的？ XML解析 + 工厂模式 + 反射机制
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        BeanFactory applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        User user=applicationContext.getBean("userBean",User.class);
        System.out.println(user);
    }

    @Test
    public void testFirstSpringCode(){

        //第一步获取Spring容器对象
        //ApplicationContext是一个接口，就是Spring容器
        //这行代码只要执行，就相当于启动spring容器，解析spring.xml，并实例化所有bean对象，放到spring容器当中
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");

        //第二步：根据bean的id从Spring容器中获取这个对象
        Object userBean=applicationContext.getBean("userBean");
        System.out.println(userBean);

        //Object userDaoBean=applicationContext.getBean("userDaoBean");
        UserDaoImplForMySQL userDaoBean = applicationContext.getBean("userDaoBean", UserDaoImplForMySQL.class);
        System.out.println(userDaoBean);
        userDaoBean.insert();


        Object nowTime=applicationContext.getBean("nowTime");
//        System.out.println(nowTime);
        //日期格式化
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strNowTime=sdf.format(nowTime);
        System.out.println(strNowTime);
    }

}
