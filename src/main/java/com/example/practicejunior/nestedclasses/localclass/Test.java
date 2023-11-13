package com.example.practicejunior.nestedclasses.localclass;

public class Test {
    public static void main(String[] args) {

        getResult(20, 5);

    }

    public static void getResult(int a, int b) {
        class Math {

            public int getDivision() {
                return a / b;
            }

            public int getMultiplication() {
                return a * b;
            }

        }

        Math math = new Math();
        System.out.println(math.getDivision());
        System.out.println(math.getMultiplication());

    }
}
