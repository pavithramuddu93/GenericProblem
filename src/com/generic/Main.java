package com.generic;

public class Main<T> {
    T Array[];


    Main(T[] Array) {
        this.Array = Array;
    }


    public static void main(String[] args) {
        Integer intArray[] = {1, 2, 3};
        Main printarray = new Main(intArray);
        Main.toPrint(printarray.Array);
        Double doubleArray[] = {1.223, 2.356, 3.456};
        System.out.println();
        Main printarray1 = new Main(doubleArray);
        Main.toPrint(printarray1.Array);
        Character charArray[] = {'A', 'b'};
        System.out.println();
        Main.toPrint(charArray);
    }

    public static <T> void toPrint(T[] Array) {
        for (T value : Array) {
            System.out.print(value + "  ");
        }
    }
}