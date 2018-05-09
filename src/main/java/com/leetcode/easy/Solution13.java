package com.leetcode.easy;

/**
 * 罗马数字包含以下七种字符：I， V， X， L，C，D 和 M。
 *
 * 字符          数值
 * I             1
 * V             5
 * X             10
 * L             50
 * C             100
 * D             500
 * M             1000
 * 例如， 罗马数字 2 写做 II ，即为两个并列的 1。12 写做 XII ，即为 X + II 。 27 写做  XXVII, 即为 XX + V + II 。
 *
 * 通常情况下，罗马数字中小的数字在大的数字的右边。但也存在特例，例如 4 不写做 IIII，而是 IV。数字 1 在数字 5 的左边，所表示的数等于大数 5 减小数 1 得到的数值 4 。同样地，数字 9 表示为 IX。这个特殊的规则只适用于以下六种情况：
 *
 * I 可以放在 V (5) 和 X (10) 的左边，来表示 4 和 9。
 * X 可以放在 L (50) 和 C (100) 的左边，来表示 40 和 90。
 * C 可以放在 D (500) 和 M (1000) 的左边，来表示 400 和 900。
 * 给定一个罗马数字，将其转换成整数。输入确保在 1 到 3999 的范围内。
 *
 * 示例 1:
 *   输入: "III"
 *   输出: 3
 *
 * 示例 2:
 *   输入: "IV"
 *   输出: 4
 *
 * 示例 3:
 *   输入: "IX"
 *   输出: 9
 *
 * 示例 4:
 *   输入: "LVIII"
 *   输出: 58
 *   解释: C = 100, L = 50, XXX = 30, III = 3.
 *
 * 示例 5:
 *   输入: "MCMXCIV"
 *   输出: 1994
 *   解释: M = 1000, CM = 900, XC = 90, IV = 4.
 * @author 阮雪峰
 * @date 2018/5/3 9:29
 */
public class Solution13 {

    public static void main(String[] args) {
//        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        int a = 0;
        String[] strings = {"IV", "IX", "XL", "XC", "CD", "CM"};
        for (String string : strings) {
            if (s.contains(string)) {
                s = s.replace(string, "");
                if ("IV".equals(string)) {
                    a += 4;
                } else if ("IX".equals(string)) {
                    a += 9;
                } else if ("XL".equals(string)) {
                    a += 40;
                } else if ("XC".equals(string)) {
                    a += 90;
                } else if ("CD".equals(string)) {
                    a += 400;
                } else if ("CM".equals(string)) {
                    a += 900;
                }
            }
        }
        for (Character c : s.toCharArray()) {
            if ("M".equals(c.toString())) {
                a += 1000;
            } else if ("D".equals(c.toString())) {
                a += 500;
            } else if ("C".equals(c.toString())) {
                a += 100;
            } else if ("L".equals(c.toString())) {
                a += 50;
            } else if ("X".equals(c.toString())) {
                a += 10;
            } else if ("V".equals(c.toString())) {
                a += 5;
            } else if ("I".equals(c.toString())) {
                a += 1;
            }
        }
        return a;
    }
}
