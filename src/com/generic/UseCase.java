package com.generic;

public class UseCase {
    public static void main(String[] args) {
        String xs = "Pear", ys = "Apple", zs = "Orange";

        if ((ys.compareTo(xs) > 0) && (ys.compareTo(zs) > 0)) {
            System.out.println(ys + " is max String");
        }
        if ((zs.compareTo(xs) > 0) && (zs.compareTo(ys) > 0)) {
            System.out.println(zs + " is max String");
        }
        if ((xs.compareTo(ys) > 0) && (xs.compareTo(zs) > 0)) {
            System.out.println(xs + " is max String");
        }
    }
}