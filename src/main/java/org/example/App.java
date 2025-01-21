package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring context from XML
        ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");

        // Get the bean
        Vehichle obj = (Vehichle) context.getBean("bike");
        obj.drive();
    }
}
