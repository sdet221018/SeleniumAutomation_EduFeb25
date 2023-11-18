package com.edureka.ExceptionHandling;

public class ExceptionHandlingR {
    public void divide(int a, int b) {
        // Calling method handling the Exception
        try {
            int result = a/b;
            System.out.println("Result of division operation is : " + result);
        }
        catch (ArithmeticException e) {
            System.out.println("Divide by Zero is not mathematically Supported.");
        }
        catch (Exception e) {
            System.out.println("Something went wrong while dividing.");
        }
        finally {
            System.out.println("From finally block - Done with First Division");
        }
    }

    public void divide2(int a, int b) throws ArithmeticException {
        // Called method handling the Exception
        int result = a/b;
        System.out.println("Result of division operation is : " + result);
    }

    public void divide3(int a, int b) throws ArithmeticException {
        // Both Calling and Called methods handling the Exception
        try {
            int result = a / b;
            System.out.println("Result of division operation is : " + result);
        }
        catch (ArithmeticException e) {
            throw new ArithmeticException("Divide by zero is not mathematically supported");
        }
        catch (Exception e) {
            System.out.println("Something went wrong while dividing.");
        }
        finally {
            System.out.println("From finally block - Done with Third Division");
        }
    }

    public static void main(String[] args) {
        ExceptionHandlingR obj = new ExceptionHandlingR();
        obj.divide(30, 0);
        System.out.println("*********************done first divide **********************");
        try {
            obj.divide2(50, 0);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("*********************done second divide**********************");
        }

        try {
            obj.divide3(70, 0);
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.out.println("*********************done third divide**********************");
        }
    }
}