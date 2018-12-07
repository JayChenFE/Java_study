package com.study;

import com.study.io.FileHelper;
import com.study.io.MyFile;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
//        System.out.println(Utils.reverseString("abcdefg"));
//        System.out.println(Utils.reverseString("abcd"));
//        System.out.println(Utils.reverseString("a"));
//
//        System.out.println(Utils.isPalindrome("abcba"));
//        System.out.println(Utils.isPalindrome("abc"));
        MyFile inputFile = new MyFile("res/input.txt");
        MyFile outputFile = new MyFile("res/output.txt");

        System.out.println(inputFile.readToString());
        inputFile.writeString("\n" + "hello again");

        FileHelper.copy(inputFile, outputFile);
    }
}
