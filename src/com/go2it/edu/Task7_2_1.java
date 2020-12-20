package com.go2it.edu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Task7_2_1 {
    public static void readInfo() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("Cat.java");
            fis.read();
        } catch (FileNotFoundException e) {
            e.getMessage();
        } catch (IOException e) {
            e.getMessage();
        } finally {
            try {
                fis.close();
            } catch (IOException | NullPointerException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        readInfo();
    }
}
