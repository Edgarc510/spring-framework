package stereotype_annotation;

import bean_practice.FullTimeEmployee;
import stereotype_annotation.config.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import stereotype_annotation.model.DataStructure;
import stereotype_annotation.model.DevOps;
import stereotype_annotation.model.ExtraHours;
import stereotype_annotation.model.Microservice;

public class RunApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);
//        DataStructure ds = container.getBean(DataStructure.class);
//        ds.getTotalHours();
        container.getBean(DataStructure.class).getTotalHours();
        container.getBean(Microservice.class).getTotalHours();
//        container.getBean(DevOps.class).getTotalHours(); noSuchBeanDefinitnon exception


        container.getBean(DataStructure.class).getTotalHours();
        container.getBean(ExtraHours.class).getHours();


    }
}
