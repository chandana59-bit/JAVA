package com.tnsif.keywords;

public class Throwkey {

    public static void main(String[] args) {
        int age = 4;
        if (age < 18) {
            throw new ArithmeticException("Not Eligible");
        } else {
            System.out.println("Eligible");
        }
    }
}

