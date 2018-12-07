package com.study;

public class Utils {
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        char temp;
        for (int front = 0, rear = chars.length - 1; front < rear; front++, rear--) {
            temp = chars[front];
            chars[front] = chars[rear];
            chars[rear] = temp;
        }
        return String.copyValueOf(chars);
    }


    public static boolean isPalindrome(String str) {
        char[] chars = str.toCharArray();
        for (int front = 0, rear = chars.length - 1; front < rear; front++, rear--) {
            if (chars[front] != chars[rear]) {
                return false;
            }
        }
        return true;
    }
}
