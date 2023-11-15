package com.example.practicejunior.nestedclasses.anonymous;

public class AnonymousClassExample {
    public static void main(String[] args) {

        MathExm mathExm = new MathExm() {
            @Override
            public void method() {
                System.out.println("sdf");
            }
        };

        mathExm.method();

    }


}

abstract class MathExm {
    abstract void method();
}
