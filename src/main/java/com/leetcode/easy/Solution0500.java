package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution0500 {

    public static void main(String[] args) {
        String[] strings = {"Hello", "Alaska", "Dad", "Peace"};
        for (String s : findWords(strings)) {
            System.out.println(s);
        }
    }

    public static String[] findWords(String[] words) {
        String str1 = "qwertyuiop";
        String str2 = "asdfghjkl";
        String str3 = "zxcvbnm";

        List<String> list = new ArrayList<String>();
        for (String word1 : words) {
            String word = word1.toLowerCase();

            if (contains(str1, word)) {
                list.add(word1);
            }

            if (contains(str2, word)) {
                list.add(word1);
            }

            if (contains(str3, word)) {
                list.add(word1);
            }
        }
        String[] strArr = new String[list.size()];
        return list.toArray(strArr);
    }

    private static boolean contains(String s, String word) {
        Character first = word.charAt(0);
        return s.contains(first.toString()) ? is(s, word) : false;
    }

    private static boolean is(String s, String word) {
        for (Character c : word.toCharArray()) {
            if (!s.contains(c.toString())) {
                return false;
            }
        }
        return true;
    }

    public String[] findWords1(String[] words) {
        String str1 = "qwertyuiop";
        List<Character> list1 = new ArrayList<Character>();
        for (char c : str1.toCharArray()) {
            list1.add(c);
        }
        String str2 = "asdfghjkl";
        List<Character> list2 = new ArrayList<Character>();
        for (char c : str2.toCharArray()) {
            list2.add(c);
        }
        String str3 = "zxcvbnm";
        List<Character> list3 = new ArrayList<Character>();
        for (char c : str3.toCharArray()) {
            list3.add(c);
        }
        List<String> list = new ArrayList<String>();
        for (String word1 : words) {
            String word = word1.toLowerCase();
            char c = word.charAt(0);
            boolean flag = true;
            if (list1.contains(c)) {
                for (char c1 : word.toCharArray()) {
                    if (!list1.contains(c1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(word1);
                }
            }

            if (list2.contains(c)) {
                for (char c1 : word.toCharArray()) {
                    if (!list2.contains(c1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(word1);
                }
            }

            if (list3.contains(c)) {
                for (char c1 : word.toCharArray()) {
                    if (!list3.contains(c1)) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    list.add(word1);
                }
            }
        }
        String[] strArr = new String[list.size()];
        return list.toArray(strArr);
    }
}
