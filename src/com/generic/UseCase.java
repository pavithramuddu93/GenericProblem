package com.generic;

public class UseCase {
    public static void main(String[] args) {

        Float xf = 9.7f, yf=17.66f, zf = 5.5f;

        float max = xf;
        if (yf.compareTo(max) > 0) {
            max = yf;
        }
        if (zf.compareTo(max) > 0) {
            max = zf;
        }
        System.out.println(max + " is max number");

    }
}