package com.go2it.edu;

public class Task7_1_b {
    public static void main(String[] args) {
        String str = "GoGoJava";
        try {
            int ind = str.indexOf("X");
            System.out.println(str.substring(ind));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }
}
