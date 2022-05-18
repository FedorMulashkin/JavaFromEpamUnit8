package org.example.changechars;

import java.util.Arrays;

public abstract class CharsToIntegers {
    private static void printStringOfInts(int[] ints) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int anInt : ints) {
            stringBuilder.append(anInt).append("\t");
        }
        System.out.println(stringBuilder);
    }

    private static void printStringOfCharsWithSpaces(char[] chars) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int anChar : chars) {
            stringBuilder.append(Character.toString(anChar)).append("\t");
        }
        System.out.println(stringBuilder);
    }

    private static int countSpaces(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                count++;
            }
        }
        return count;
    }

    private static int[] convertStringToInts(String str) {
        int spaces = countSpaces(str);
        int l = str.length() - spaces;
        int[] ints = new int[l];
        char ch;
        int spaceRecord = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                ints[i - spaceRecord] = ch - 'a' + 1;
            } else {
                spaceRecord++;
            }
        }
        return ints;
    }

    private static char[] convertStringToChars(String str) {
        int spaces = countSpaces(str);
        int l = str.length() - spaces;
        char[] chars = new char[l];
        char ch;
        int spaceRecord = 0;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            if (ch != ' ') {
                chars[i - spaceRecord] = ch;
            } else {
                spaceRecord++;
            }
        }
        return chars;
    }

    public static void printWeirdString(String str) {
        char[] chars = convertStringToChars(str);
        int[] ints = convertStringToInts(str);
        printStringOfCharsWithSpaces(chars);
        printStringOfInts(ints);
    }
}
