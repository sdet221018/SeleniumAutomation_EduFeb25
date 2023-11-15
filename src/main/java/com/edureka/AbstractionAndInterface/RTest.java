package com.edureka.AbstractionAndInterface;

public abstract class RTest {

    abstract void p1();
    abstract void p2();

    public static void m1() {
        System.out.println("Running in static m1()");
    }

    public void m2() {
        System.out.println("Running in non-static m2()");
    }
}
