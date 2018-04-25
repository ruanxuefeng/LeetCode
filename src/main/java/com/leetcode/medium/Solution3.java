package com.leetcode.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 *
 * 示例：
 *  给定 "abcabcbb" ，没有重复字符的最长子串是 "abc" ，那么长度就是3。
 *
 * 给定 "bbbbb" ，最长的子串就是 "b" ，长度是1。
 *
 * 给定 "pwwkew" ，最长子串是 "wke" ，长度是3。请注意答案必须是一个子串，"pwke" 是 子序列  而不是子串。
 *
 * @author 阮雪峰
 * @date 2018/4/23 13:43
 */
public class Solution3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("bbbbb"));
        System.out.println(lengthOfLongestSubstring("pwwkew"));
        System.out.println(lengthOfLongestSubstring(""));
        System.out.println(lengthOfLongestSubstring("c"));
        System.out.println(lengthOfLongestSubstring("aab"));
        System.out.println(lengthOfLongestSubstring("dvdf"));
        System.out.println(lengthOfLongestSubstring("anviaj"));
        System.out.println(lengthOfLongestSubstring("asjrgapa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        char[] chars = s.toCharArray();
        int result,i,j;
        result = i = j = 0;
        while (i < chars.length && j < chars.length) {
            if (!set.contains(chars[i])) {
                set.add(chars[i++]);
            }else {
                result = Math.max(i-j, result);
                set.remove(chars[j++]);
            }
        }

        return Math.max(i-j, result);
    }

    /*public static int lengthOfLongestSubstring(String s) {
        int result = 0;
        if (s == null || s.length() == 0) {
            return 0;
        }
        Set<Character> set = new HashSet<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            set.add(chars[i]);
            for (int j = i+1; j < chars.length; j++) {
                int a = set.size();
                set.add(chars[j]);
                int b = set.size();
                if (a == b) {
                    result = Math.max(a, result);
                    set = new HashSet<Character>();
                    break;
                }
            }
        }

        return Math.max(set.size(), result);
    }*/
}
