package com.leetcode.medium;

/**
 *  给定一个字符串 s，找到 s 中最长的回文子串。你可以假设 s 的最大长度为1000。
 *
 *  示例 1：
 *   输入: "babad"
 *   输出: "bab"
 *   注意: "aba"也是一个有效答案。
 *
 *  示例 2：
 *   输入: "cbbd"
 *   输出: "bb"
 * @author 阮雪峰
 * @date 2018/4/25 13:15
 */
public class Solution0005 {

    public static void main(String[] args) {
        /*System.out.println(isPalindromic("abba"));
        System.out.println(isPalindromic("abbaa"));*/
//        System.out.println("abbaa".substring(0,4));
        System.out.println(longestPalindrome("bb"));
        System.out.println(longestPalindrome("a"));
        System.out.println(longestPalindrome("abbaa"));
        System.out.println(longestPalindrome("babad"));
    }


    public static String longestPalindrome(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return s;
        }
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int[] i1 = expandAroundCenter(s, i, i);
            if ((end - start) < i1[0]  - i1[1]) {
                start = i1[1];
                end = i1[0];
            }
            int[] i2 = expandAroundCenter(s, i, i + 1);
            if ((end - start) < i2[0]  - i2[1]) {
                start = i2[1];
                end = i2[0];
            }
        }
        return s.substring(start+1,end);
    }

    private static int[] expandAroundCenter(String s, int left, int right) {
        while (left >= 0 && (right + 1) <= s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        int[] i = {right, left};
        return i;

    }

   /* public static String longestPalindrome(String s) {
        if (s == null || s.equals("")) {
            return "";
        }
        if (isPalindromic(s)) {
            return s;
        }
        String result = "";
        int i = 0, j = s.length(), k = 0;
        while (i < j && s.substring(i, j).length()>result.length()) {
            String s1 = s.substring(i, k);
            if (isPalindromic(s1)) {
                result = result.length() < s1.length() ? s1 : result;
            }
            String s2 = s.substring(k, j);
            if (isPalindromic(s2)) {
                result = result.length() < s2.length() ? s2 : result;
            }
            k++;
            if (k == j) {
                i++;
                j--;
                k = i;
            }
        }
        return result;
    }

    private static boolean isPalindromic(String string) {
        int i = 0, j = string.length() - 1;
        while (i < j) {
            if (string.charAt(i) != string.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }*/
}
