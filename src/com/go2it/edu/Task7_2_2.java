package com.go2it.edu;

import java.util.Scanner;

public class Task7_2_2 {
    public static void creatPassword() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a password of at least 8 and no more than 12 characters");
        String password = input.next();
        if (password.length() < 8 && password.length() > 12) {
            try {
                throw new IllegalArgumentException("Incorrect length of password");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                creatPassword();
            }
        } else {
            System.out.println("Password accepted");
        }

    }

    public static void main(String[] args) {
        creatPassword();
    }
}
