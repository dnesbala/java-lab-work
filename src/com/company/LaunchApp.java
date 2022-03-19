package com.company;

import java.io.IOException;

public class LaunchApp {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();

        try {
            Process process = runtime.exec("notepad.exe");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

