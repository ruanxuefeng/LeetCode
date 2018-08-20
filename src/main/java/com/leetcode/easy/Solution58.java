package com.leetcode.easy;

/**
 *  给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 *
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 *
 * 示例:
 *
 * 输入: "Hello World"
 * 输出: 5
 * @author 阮雪峰
 * @date 2018/8/20 10:39
 */
public class Solution58 {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord(" "));
    }
    public static int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        String[] strings = s.split(" ");
        return strings.length==0?0:strings[strings.length - 1].length();
    }
}
