package com.leetcode.easy;

/**
 *  给定一个正整数，检查他是否为交替位二进制数：换句话说，就是他的二进制数相邻的两个位数永不相等。
 *
 * 示例 1:
 *   输入: 5
 *   输出: True
 *   解释:
 *   5的二进制数是: 101
 *
 * 示例 2:
 *   输入: 7
 *   输出: False
 *   解释:
 *   7的二进制数是: 111
 *
 * 示例 3:
 *   输入: 11
 *   输出: False
 *   解释:
 *   11的二进制数是: 1011
 *
 * 示例 4:
 *   输入: 10
 *   输出: True
 *   解释:
 *   10的二进制数是: 1010
 * @author 阮雪峰
 * @date 2018/5/2 10:05
 */
public class Solution693 {

    public boolean hasAlternatingBits(int n) {
        char[] chars = Integer.toBinaryString(n).toCharArray();
        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == chars[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
