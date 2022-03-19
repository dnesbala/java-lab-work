package com.company;

import java.util.Scanner;

public class Q1If {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age;

        System.out.println("Enter your age : ");
        age = sc.nextInt();
        if (age >= 18) {
            System.out.println("You are eligible for voting.");
        } else {
            System.out.println("You are not eligible for voting.");
        }
    }
}

