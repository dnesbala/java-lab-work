package com.company;

import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Q7FileHandling {
    File f1 = new File("D:\\java\\abc.txt");

    void createNewFile() throws IOException {
        if (f1.createNewFile()) {
            System.out.println("File is created : " + f1.getName());
        } else {
            System.out.println("File already exists.");
        }

        System.out.println("File abc exists? " + f1.exists());
        System.out.println("Is abc a directory? " + f1.isDirectory());
        System.out.println("Is abc a file? " + f1.isFile());
        System.out.println("Name of file : " + f1.getName());
        System.out.println("Absolute path of file : " + f1.getAbsolutePath());
    }

    void renameFile() {
        if (f1.renameTo(new File("D:\\java\\xyz.txt"))) {
            System.out.println("File renamed successfully.");
        } else {
            System.out.println("File rename failed.");
        }
    }

    void deleteFile() {
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the absolute file path to delete : ");
        filePath = sc.next();

        File file = new File(filePath);
        if (file.delete()) {
            System.out.println("File deletion successful.");
        } else {
            System.out.println("File deletion failed.");
        }
    }

    void createDirectory() {
        if(f1.mkdir()) {
            System.out.println("Directory is created.");
        } else {
            System.out.println("Failed to create directory.");
        }
    }

    public static void main(String[] args) throws IOException {
        Q7FileHandling fileHandler = new Q7FileHandling();
        fileHandler.createNewFile();
        fileHandler.renameFile();
        fileHandler.deleteFile();

        fileHandler.createDirectory();
    }
}


