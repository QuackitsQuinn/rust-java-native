package org.example;

public class Main {
    private void weenus(){};
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int number = NativeMath.FastAdd(10,30);
        System.out.println("10 plus 30 in rust is "+number);
    }
}