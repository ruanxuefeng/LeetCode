package com.leetcode.easy;

/**
 *  报数序列是指一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n ，输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 * @author 阮雪峰
 * @date 2018/8/20 9:41
 */
public class Solution38 {
    public static void main(String[] args) {
        System.out.println(countAndSay(7));
    }

    public static String countAndSay(int n) {
        if (n <= 0) {
            return "";
        }
        String[] strings = new String[n];
        strings[0] = "1";
        int index = 0;
        StringBuffer stringBuffer;
        for (String string : strings) {
            index++;
            if (index == n) {
                break;
            }
            stringBuffer = new StringBuffer();
            int count = 1;
            for (int i = 0; i < string.length(); i++) {
                if (i == (string.length() - 1) || string.charAt(i) != string.charAt(i + 1)) {
                    stringBuffer.append(count).append(string.charAt(i));
                    count = 1;
                } else if (string.charAt(i) == string.charAt(i + 1)) {
                    count++;
                }
            }
            strings[index] = stringBuffer.toString();
        }
        return strings[n - 1];
    }
}
