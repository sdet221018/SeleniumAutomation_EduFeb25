package com.edureka.AbstractionAndInterface;

public class RDemo extends RTest{

    public static void main(String[] args) {
        RDemo r = new RDemo();
        r.p1();
        r.m1();
        r.p2();
        r.m2();
    }

//    @Override
    void p1() {
        System.out.println("Running in P1()");
    }

//    @Override
    void p2() {
        System.out.println("Running in P2()");
    }
}
