package com.go2it.edu;

public class TaskB {
    public static void main(String[] args) {
        String str = "GoGoJava";
        try{
            int ind = str.indexOf("X");
            System.out.println(str.substring(ind));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(str.substring(str.length()/2));
        }
    }
}
