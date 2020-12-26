package com.go2it.edu;

public class Task7_1_a {
    public static void main(String[] args) {
        try {
            String a = args[99];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("This element doesn't exist");
        } finally {
            System.out.println("Merry Christmas");
        }

    }
}
