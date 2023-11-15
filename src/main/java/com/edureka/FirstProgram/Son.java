package com.edureka.FirstProgram;

public class Son extends Father{
    public void job() {
        System.out.println("Private Job");
    }

    public static void main(String[] args) {
        Son s = new Son();
        s.job();

        Father f = new Father();
        f.job();
    }
}
