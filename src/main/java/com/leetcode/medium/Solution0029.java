package com.leetcode.medium;

/**
 *  给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
 *
 * 返回被除数 dividend 除以除数 divisor 得到的商。
 *
 * 示例 1:
 *
 * 输入: dividend = 10, divisor = 3
 * 输出: 3
 * 示例 2:
 *
 * 输入: dividend = 7, divisor = -3
 * 输出: -2
 * 说明:
 *
 * 被除数和除数均为 32 位有符号整数。
 * 除数不为 0。
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−231,  231 − 1]。本题中，如果除法结果溢出，则返回 231 − 1。
 * @author 阮雪峰
 * @date 2018/5/10 10:10
 */
public class Solution0029 {
    public static void main(String[] args) {
        int a = Integer.MIN_VALUE;
        int b = -1;
        System.out.println(divide(a, b));
    }

    public static int divide(int dividend, int divisor) {
        int tag = 1;
        long a = dividend;
        long b = divisor;
        if (divisor == 1) {
            return dividend;
        }
        if (divisor == -1) {
            if (dividend == Integer.MIN_VALUE) {
                return Integer.MAX_VALUE;
            }
            return -dividend;
        }
        if (dividend >= 0 && divisor >= 0 || dividend <= 0 && divisor <= 0) {
            tag = 1;
        } else {
            tag = -1;
        }
        a = Math.abs((long) a);
        b = Math.abs((long) b);
        if (a < b) {
            return 0;
        }
        int re = 0;
        while (a >= b) {
            int temp = 1;
            long bt = b;
            while (a >= bt << 1) {
                bt = bt << 1;
                temp = temp << 1;
            }
            re += temp;
            a -= bt;
        }
        return re * tag;
    }

    public static int divide1(int dividend, int divisor) {
        int a = 1, b = 1, e = 0;
        long c = dividend, d = divisor;
        if (c < 0) {
            a = -1;
            c = c * -1;
        }
        if (d < 0) {
            b = -1;
            d = d * -1;
        }
        if (d == 1) {
            return (int) ((c >= Integer.MAX_VALUE ? Integer.MAX_VALUE : c) * a * b);
        }
        while (c >= d) {
            c -= d;
            e++;
            if (e == Integer.MAX_VALUE) {
                break;
            }
        }
        return e * a * b;
    }


}
