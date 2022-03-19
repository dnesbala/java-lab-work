package com.company;

import java.util.Scanner;

public class Q1Switch {
    public static void main(String[] args) {
        char grade;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your grade: ");
        grade = sc.next().toUpperCase().charAt(0);

        switch (grade) {
            case 'A' -> System.out.println("Excellent.");
            case 'B' -> System.out.println("Good.");
            case 'C' -> System.out.println("Satisfactory.");
            case 'D' -> System.out.println("Just Passed.");
            default -> System.out.println("Failed.");
        }
    }
}

