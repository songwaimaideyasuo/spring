package com.w.spring.test;

import com.w.spring6.bean.Vip;
import com.w.spring6.bean1.Order;
import com.w.spring6.bean2.Person;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanTest {

    @Test
    public void testFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);

        Person personBean2 = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean2);
    }

    @Test
    public void testSelfFactoryBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Order orderBean = applicationContext.getBean("orderBean", Order.class);
        System.out.println(orderBean);
    }

    @Test
    public void testSimpleFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        Vip vip = applicationContext.getBean("vipBean", Vip.class);
        System.out.println(vip);
    }
}
