package com.example.practicejunior.nestedclasses.staticnestedclass;

public class Test {
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(250);
        Car car = new Car("bnw", "red", engine);
    }
}
