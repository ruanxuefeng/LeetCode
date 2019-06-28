package com.leetcode.easy;

/**
 *  假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 * @author 阮雪峰
 * @date 2018/8/20 14:09
 */
public class Solution0070 {
    public static void main(String[] args) {
        System.out.println(climbStairs(2));
    }

    public static int climbStairs(int n) {
        if (n < 3) {
            return n;
        }
        int[] arr = new int[n];
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 3;
        return a(n, arr);
    }

    public static int a(int n, int[] arr) {

        int a = arr[n - 1];
        if (a == 0) {
            a = arr[n - 1] = a(n - 1, arr);

        }
        int b = arr[n - 2];
        if (b == 0) {
            b = arr[n - 2] = a(n - 2, arr);
        }
        return a + b;
    }
}
