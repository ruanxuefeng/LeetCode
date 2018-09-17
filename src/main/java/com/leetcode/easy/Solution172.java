package com.leetcode.easy;

/**
 *  给定一个整数 n，返回 n! 结果尾数中零的数量。
 *
 * 示例 1:
 *
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 *
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * @author 阮雪峰
 * @date 2018/9/17 9:55
 */
public class Solution172 {

    public static void main(String[] args) {
        System.out.println(trailingZeroes(25));
    }
    public static int trailingZeroes(int n) {
        if (n < 5) {
            return 0;
        } else {

            int result = 0;
            while (n >= 5) {
                n = n / 5;
                result += n;
            }

            return result;
        }
    }
}
