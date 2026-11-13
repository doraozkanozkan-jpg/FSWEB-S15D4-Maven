package org.example;

import java.util.Locale;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static boolean checkForPalindrome(String text) {
        String cleaned = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(Locale.ENGLISH);
        Stack<Character> stack = new Stack<>();
        for (char c : cleaned.toCharArray()) {
            stack.push(c);
        }
        for (char c : cleaned.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }

    public static String convertDecimalToBinary(int decimal) {
        return Integer.toBinaryString(decimal);
    }
}
