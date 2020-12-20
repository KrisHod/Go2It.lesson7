package com.go2it.edu;

import java.io.IOException;

public class Task7_1_c {
    public static void main(String[] args) throws IOException {
        int i = 2;
        try {
            if (i % 2 == 0) {
                throw new RuntimeException("This is test exception");
            } else {
//normal execution
            }
        } catch (RuntimeException e) {
//handle RTE
            System.out.println("Woohoo !I’ve caught RuntimeException");
        } finally {
            System.out.println("This code will be executed always!");
            throw new IOException("IOException");
        }
    }
}
