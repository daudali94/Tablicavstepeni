package com.company;

public class Main {

    public static void main(String[] args) {
        int korzina = 1;
        for (int a = 1; a <= 10; a++) {
            korzina *= 2;
            System.out.println("2^" + a  + " = " + korzina);
        }
    }
}
