package org.example;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehichle {
    public void drive(){
        System.out.println("bike is running ");
    }
}
