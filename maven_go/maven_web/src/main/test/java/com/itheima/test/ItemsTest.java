package com.itheima.test;

import cn.dzy.domain.Account;
import cn.dzy.service.MavenService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

public class ItemsTest {

   @Test
    public void findAll(){

       ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
       MavenService mavenService = ac.getBean(MavenService.class);
        Account all = mavenService.findAll();

    }
}
