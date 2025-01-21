package org.example;

import org.springframework.stereotype.Component;
@Component(value = "car")
public class Car implements Vehichle {
    public void drive(){
        System.out.println("car is runnning");
    }
}
