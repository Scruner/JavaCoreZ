package com.company.lesson_4;

public class Car {

    String color = "red";
    String engine = "V6";
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "black";
        car1.engine = "V8";

        System.out.println("Motor: "+car1.engine);
        System.out.println("Cvet: "+car1.color);
    }
}
