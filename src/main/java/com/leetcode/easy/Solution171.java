package com.leetcode.easy;

/**
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 * @author 阮雪峰
 * @date 2018/9/12 16:40
 */
public class Solution171 {
    public static void main(String[] args) {
        System.out.println(titleToNumber("Z"));
    }

    public static int titleToNumber(String s) {
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] chars = s.toCharArray();
        int result = 0;
        int i = chars.length - 1, j = 0;
        while (j <= i) {
            int b = str.lastIndexOf(chars[i - j]);
            result += Math.pow(26, j) * b;
            j++;
        }
        return result;
    }
}