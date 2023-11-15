package com.edureka.FirstProgram;

public class MethodOverloading {
    public static void m1() {
        System.out.println("Running in method");
    }
    public static void m1(int x) {
        System.out.println("Running in int argumented method with value of x: " + x);
    }

    public static void m1(char ch) {
        System.out.println("Running in char argumented method with value of ch: " + ch);
    }

    public static void m1(double d) {
        System.out.println("Running in double argumented method with value of d: " + d);
    }

    public static void m1(String str) {
        System.out.println("Running in String argumented method with value of str: " + str);
    }

    public static void main(String[] args) {
        m1();
        m1("Asgar");
        m1(48);
        m1(34.56);
        m1('£');
    }
}
