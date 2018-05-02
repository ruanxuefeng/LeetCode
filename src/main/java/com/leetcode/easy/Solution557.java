package com.leetcode.easy;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 * 示例 1:
 *   输入: "Let's take LeetCode contest"
 *   输出: "s'teL ekat edoCteeL tsetnoc"
 *
 * 注意：在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 * @author 阮雪峰
 * @date 2018/5/2 9:37
 */
public class Solution557 {
    public static String solution_344(String s) {
        StringBuffer str = new StringBuffer();
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            str.append(c[i]);
        }
        return str.toString();
    }

    public String reverseWords(String s) {
        StringBuffer str = new StringBuffer();
        String[] strArr = s.split(" ");
        for (String s1 : strArr) {
            str.append(solution_344(s1)).append(" ");
        }
        return str.substring(0, str.length() - 1);
    }
}
