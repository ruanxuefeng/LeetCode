package com.leetcode.easy;

/**
 *  请编写一个函数，其功能是将输入的字符串反转过来。
 *
 *  示例：
 *   输入：s = "hello"
 *   返回："olleh"
 *
 * @author 阮雪峰
 * @date 2018/4/28 8:58
 */
public class Solution0344 {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    /**
     *
     * @author 阮雪峰
     * @date 2018/4/28 9:09
     */
    public static String reverseString(String s) {
        char[] chars = new char[s.length()];
        int i = 0, j = s.length() - 1;
        while (i <= j) {
            chars[i] = s.charAt(j);
            chars[j--] = s.charAt(i++);
        }
        return new String(chars);
    }

    /**
     * 暴力解
     * @param s
     * @return java.lang.String
     * @throws
     * @author 阮雪峰
     * @date 2018/4/28 9:09
     */
    public String reverseString1(String s) {
        StringBuffer str = new StringBuffer();
        char[] c = s.toCharArray();
        for (int i = c.length - 1; i >= 0; i--) {
            str.append(c[i]);
        }
        return str.toString();
    }
}
