package com.w.spring6.text;

import com.w.spring6.bean.QianDaYe;
import com.w.spring6.bean.User;
import com.w.spring6.jdbc.MyDataSource;
import com.w.spring6.service.CustomerService;
import com.w.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {

    @Test
    public void testProperties() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource da=applicationContext.getBean("da", MyDataSource.class);
        System.out.println(da);
    }

    @Test
    public void testArray() {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-array.xml");
        QianDaYe yuQian=applicationContext.getBean("yuQian", QianDaYe.class);
        System.out.println(yuQian);

    }
    @Test
    public void testMyDataSource() {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("set-di.xml");
        MyDataSource myDataSource=applicationContext.getBean("myDataSource", MyDataSource.class);
        System.out.println(myDataSource);
    }

    @Test
    public void testSimpleTypeSet() {

        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        User user=applicationContext.getBean("userBean", User.class);
        System.out.println(user);
    }

    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
        CustomerService customerService=applicationContext.getBean("csBean", CustomerService.class);
        customerService.save();
    }

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=applicationContext.getBean("userServiceBean",UserService.class);
        userService.saveUser();
    }
}
