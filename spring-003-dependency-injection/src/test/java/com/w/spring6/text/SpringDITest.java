package com.w.spring6.text;

import com.w.spring6.bean.Customer;
import com.w.spring6.bean.People;
import com.w.spring6.bean.QianDaYe;
import com.w.spring6.bean.User;
import com.w.spring6.jdbc.MyDataSource;
import com.w.spring6.jdbc.MyDataSource1;
import com.w.spring6.jdbc.MyDataSource2;
import com.w.spring6.service.CustomerService;
import com.w.spring6.service.OrderService;
import com.w.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDITest {

    @Test
    public void testUtil(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-util.xml");

        MyDataSource1 dataSource1 = applicationContext.getBean("dataSource1", MyDataSource1.class);
        System.out.println(dataSource1);

        MyDataSource2 dataSource2 = applicationContext.getBean("dataSource2", MyDataSource2.class);
        System.out.println(dataSource2);
    }


    @Test
    public void testAutowireByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-autowire.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
    }


    @Test
    public void testP(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-p.xml");
        Customer customerBean = applicationContext.getBean("customerBean", Customer.class);
        System.out.println(customerBean);
    }

    @Test
    public void testCollection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-collection.xml");
        People peopleBean = applicationContext.getBean("peopleBean", People.class);
        System.out.println(peopleBean);
    }


    @Test
    public void testProperties() {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-properties.xml");
        MyDataSource da=applicationContext.getBean("dataSource", MyDataSource.class);
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

//    @Test
//    public void testConstructorDI(){
//        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("beans.xml");
//        CustomerService customerService=applicationContext.getBean("csBean", CustomerService.class);
//        customerService.save();
//    }

    @Test
    public void testSetDI(){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring.xml");
        UserService userService=applicationContext.getBean("userServiceBean",UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructorDI(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        OrderService orderServiceBean = applicationContext.getBean("orderServiceBean", OrderService.class);
        orderServiceBean.delete();
    }

}
