package com.edureka.FirstProgram;

public class B extends A {
    static String neededproperty = "55K GBP";

    public static void main(String[] args) {
        B ref = new B();

        System.out.println(ref.property);
        System.out.println(ref.neededproperty);
    }
}
