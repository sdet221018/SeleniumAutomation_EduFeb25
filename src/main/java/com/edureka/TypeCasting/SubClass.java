package com.edureka.TypeCasting;

import net.bytebuddy.implementation.bind.annotation.Super;

public class SubClass extends SuperClass {

    public void c3() {
        System.out.println("Running in c3() of SubClass");
    }

    public void c4() {
        System.out.println("Running in c4() of SubClass");
    }

    public static void main(String[] args) {
        // Sub Class Object
        SubClass subClass = new SubClass();
        subClass.c3();
        subClass.c4();

        subClass.c1();
        subClass.c2();

        //Conversion of Sub Class to Super Class Object (UP CASTING)
        System.out.println("====================UP CASTING==========================");
        SuperClass subClass1 = (SuperClass) subClass;

        subClass1.c1();
        subClass1.c2();

        //Conversion of Sub Class to Super Class Object (DOWN CASTING)
        System.out.println("====================DOWN CASTING==========================");
        SubClass subClass2 = (SubClass) subClass1;
        subClass2.c1();
        subClass2.c2();
        subClass2.c3();
        subClass2.c4();
    }

}
