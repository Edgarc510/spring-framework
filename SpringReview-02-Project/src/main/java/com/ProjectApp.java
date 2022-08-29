package com;

import com.project.config.ConfigApp;
import com.project.services.SalaryService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProjectApp {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        SalaryService salaryService = context.getBean(SalaryService.class);
        salaryService.calculateRegularSalary();

    }

}
