package com.itboywh.test;

import com.itboywh.service.AccoutService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wh
 * @date 2021年11月20日14:19
 */

public class springTest {
    @Test
    public void springrun1(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("classpath:applictionContent.xml");
        AccoutService as= (AccoutService)ac.getBean("accoutService");
         as.findAll();
    }
}
