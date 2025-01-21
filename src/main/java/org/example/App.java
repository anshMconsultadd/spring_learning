package org.example;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring context from XML
        ApplicationContext context = new AnnotationConfigApplicationContext("org.example");

        // Get the bean
        Vehichle obj = context.getBean( "car", Vehichle.class);
        obj.drive();
    }
}
