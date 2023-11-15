package com.edureka.FirstProgram;

public class ReturnTypeofAMethod {
    int xyz = 300;

    public static void main(String[] args) {
        int var = m1();
        System.out.println(var);

        String str = m2();
        System.out.println(str);

        ReturnTypeofAMethod obj = m3();
        System.out.println(obj.xyz);

        Oreo obj1 = OreoMethod();
        System.out.println(obj1.name);
    }
    public static int m1() {
        return 15;
    }

    public static String m2( ) {
        return "Azeej";
    }

    public static ReturnTypeofAMethod m3() {
        ReturnTypeofAMethod ref = new ReturnTypeofAMethod();
/*        int number = ref.xyz;
        System.out.println(number);*/

        return ref;
    }

    public static Oreo OreoMethod() {
        Oreo ref =  new Oreo();
        return ref;

    }
}
