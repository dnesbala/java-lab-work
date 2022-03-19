package com.company;

public class Q1DoWhile {
    public static void main(String[] args) {
        int i = 20;
        System.out.println("Multiplication Table of 5: ");
        do {
            System.out.printf("5 * %s = %s\t\t", i, 5 * i);
            i++;
        } while (i <= 10);
    }
}

