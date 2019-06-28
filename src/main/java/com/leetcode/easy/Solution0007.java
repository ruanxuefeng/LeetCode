package com.leetcode.easy;

/**
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 * 示例 1:
 *   输入: 123
 *   输出: 321
 * 示例 2:
 *   输入: -123
 *   输出: -321
 * 示例 3:
 *   输入: 120
 *   输出: 21
 * 注意:
 *   假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。根据这个假设，如果反转后的整数溢出，则返回 0。
 * @author 阮雪峰
 * @date 2018/4/26 13:59
 */
public class Solution0007 {

    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE);
//        9646324351
//        2147483647
//        System.out.println(reverse(1534236469));
        System.out.println(reverse(-2147483648));
    }

    public static int reverse(int x) {
        long a = Long.valueOf(x);
        String s = String.valueOf(a < 0 ? (a * -1) : a);
        StringBuilder result = new StringBuilder();
        for (int i = s.toCharArray().length - 1; i >= 0; i--) {
            result.append(s.charAt(i));
        }
        return Long.valueOf(result.toString()) > Integer.MAX_VALUE ? 0 : Integer.valueOf(result.toString()) * (a < 0 ? -1 : 1);
    }
}
