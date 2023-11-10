package com.w.spring6.test;

import com.w.spring.bean.SpringBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeTest {

    @Test
    public void testBeanScope(){

        /*
        1.spring默认情况下是如何管理这个bean的
             默认情况下，Bean是单例的
             在spring上下文初始化的时候实例化
             每一次调用getBean（）方法是，都返回那个单例对象
        2.当将bean的scope属性设置为prototype：
             bean是多例的
             spring上下文初始化的时候,并不会初始化这些prototype的bean
             每一次调用getBean（）方法是，实例化该bean对象
         */
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("spring-scope.xml");
//        SpringBean sb=applicationContext.getBean("sb", SpringBean.class);
//        System.out.println(sb);
    }


}
