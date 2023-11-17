package com.edureka.TypeCasting;

public class SuperClass {

    public void c1() {
        System.out.println("Running in c1() of SuperClass");
    }

    public void c2() {
        System.out.println("Running in c2() of SuperClass");
    }

    public static void main(String[] args)  {
        SuperClass supClass = new SuperClass();
        supClass.c1();
        supClass.c2();
    }
}
