package com.example.practicejunior.nestedclasses.innerclass;

public class Test {
    public static void main(String[] args) {
        Car car = new Car("volve", "blue");
        Car.Engine engine = car.new Engine(250);
        car.setEngine(engine);
    }
}
