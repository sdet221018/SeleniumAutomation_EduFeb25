package com.edureka.TypeCasting;
// Runtime / ExecutionTime / Dynamic Polymorphism, Late Binding
public class B extends A {
    public void c3() {
        System.out.println("Running in c3() of SubClass B");
    }

    public void c1() {
        System.out.println("Running in c1() of SubClass B");
    }

    public static void main(String[] args) {
        // Sub Class Object
        B b = new B();
        b.c1();

        // Sub Class to Super Class Object
        // Up Casting
        System.out.println("====================UP CASTING with OverRiding==========================");
        A a = (A)b;

        a.c1();
        a.c2();

        // Super Class to Sub Class Object
        // Down Casting
        System.out.println("====================DOWN CASTING with OverRiding==========================");
        B b1 = (B)a;

        b1.c1();
        b1.c2();
        b1.c3();

    }

}
