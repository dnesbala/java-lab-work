package com.company;

public class Q3SecondPattern {
    public static void main(String[] args) {
        int i, j;
        for (i = 1; i <= 4; i++) {
            for (j = 1; j <= (4-i); j++) {
                System.out.print("\t");
            }
            for (j = 1; j <= i; j++) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
    }
}



