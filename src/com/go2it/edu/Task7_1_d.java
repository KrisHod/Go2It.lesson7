package com.go2it.edu;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Task7_1_d {
    public static void main(String[] args) {
        try {
            new BufferedReader(new FileReader("Dog.class"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            e.getMessage();
        } finally {
            System.out.println("Keep calm");
        }
    }
}
