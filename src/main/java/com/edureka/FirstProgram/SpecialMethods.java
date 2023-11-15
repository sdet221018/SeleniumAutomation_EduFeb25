package com.edureka.FirstProgram;

public class SpecialMethods {

    public SpecialMethods() {
        System.out.println("Running in Constructor");
    }
    public SpecialMethods(int x) {
        System.out.println("Running in int argumented Constructor with value of x: " + x);
    }

    public SpecialMethods(double d) {
        System.out.println("Running in double argumented Constructor with value of d: " + d);
    }

    public SpecialMethods(String str) {
        System.out.println("Running in String argumented Constructor with value of str: " + str);
    }

    public static void main(String[] args) {
        SpecialMethods ref = new SpecialMethods();
        SpecialMethods ref1 = new SpecialMethods(30);
        SpecialMethods ref2 = new SpecialMethods(30.8);
        SpecialMethods ref3 = new SpecialMethods("Akbar");
    }
}
