// program to show usage of final and static modifier

package com.company;

public class AppConstants {
    static final String appName = "App Name";

    static String getData() {
        // appName = "Cannot reassign as it is declared final";
        return "{statusCode: 200, data: " + appName + "}";
    }

    public static void main(String[] args) {
        System.out.println(AppConstants.getData());
    }
}


