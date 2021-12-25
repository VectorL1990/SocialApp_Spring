package com.socialappservice;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainSerivce {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        ProjectSupervisionService projectSupervisionService = context.getBean(ProjectSupervisionService.class);
        //System.out.println("testsetset");
    }
}
