package com.leetcode.easy;

/**
 *  给定一个正整数，返回它在 Excel 表中相对应的列名称。
 *
 * 例如，
 *
 *     1 -> A
 *     2 -> B
 *     3 -> C
 *     ...
 *     26 -> Z
 *     27 -> AA
 *     28 -> AB
 *     ...
 * 示例 1:
 *
 * 输入: 1
 * 输出: "A"
 * 示例 2:
 *
 * 输入: 28
 * 输出: "AB"
 * 示例 3:
 *
 * 输入: 701
 * 输出: "ZY"
 * @author 阮雪峰
 * @date 2018/9/10 13:45
 */
public class Solution0168 {
    public static void main(String[] args) {
        System.out.println(convertToTitle(2735));
    }

    public static String convertToTitle(int n) {
        String str = " ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuilder result = new StringBuilder();
        while (n > 26) {
            int d = n % 26;
            if (d == 0) {
                result.insert(0, str.charAt(26));
                n = n - 1;
            } else {
                result.insert(0, str.charAt(d));
            }
            n = n / 26;
        }
        result.insert(0, str.charAt(n));
        return result.toString();
    }
}
