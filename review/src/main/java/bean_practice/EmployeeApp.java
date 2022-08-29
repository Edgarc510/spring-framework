package bean_practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class EmployeeApp {
    public static void main(String[] args){

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class,ConfigAny.class);

        FullTimeEmployee ft = container.getBean(FullTimeEmployee.class);
        ft.createAccount();
        PartTimeEmployee pt = container.getBean(PartTimeEmployee.class);
        pt.createAccount();

         container= new AnnotationConfigApplicationContext(ConfigAny.class);

//        String st = container.getBean(String.class);
        String st = container.getBean("message1",String.class);
        System.out.println("st = " + st);



    }
}
