package com.edureka.AbstractionAndInterface;

public class Bhuvana implements Niviya {

    public static void main(String[] args) {
        Bhuvana ref = new Bhuvana();
        ref.a1();
        ref.a2();
        ref.a3();
    }

    @Override
    public void a1() {
        System.out.println("Running in a1()");
    }

    @Override
    public void a2() {
        System.out.println("Running in a2()");
    }

    @Override
    public void a3() {
        System.out.println("Running in a3()");
    }
}
