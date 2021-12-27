package com.socialappservice;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;

public class MainService {

    // This ArrayList should be initialized from DB
    private ArrayList<OperatingProject> operatingProjects = new ArrayList<OperatingProject>();

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        System.out.println("testsetset");
    }

    private void initialProject() {
        OperatingProject newProject = new OperatingProject();
        operatingProjects.add(newProject);
    }
}
