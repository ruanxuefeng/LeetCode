package com.leetcode.easy;

/**
 *  对于一个 正整数，如果它和除了它自身以外的所有正因子之和相等，我们称它为“完美数”。
 * 给定一个 正整数 n， 如果他是完美数，返回 True，否则返回 False
 *
 * 示例：
 *   输入: 28
 *   输出: True
 *   解释: 28 = 1 + 2 + 4 + 7 + 14
 *
 * @author 阮雪峰
 * @date 2018/5/2 9:34
 */
public class Solution0507 {
    public static boolean isPrimeNumbers(int a) {
        for (int i = 2; i <= (a % 2 == 0 ? a / 2 : ((a + 1) / 2)); i++) {
            if ((a % i == 0)) {
                return false;
            }
        }
        return true;
    }

    public boolean checkPerfectNumber(int num) {
        if (num == 0) {
            return false;
        }
        int a = num;
        while (a % 2 == 0) {
            a = a / 2;
        }
        for (int i = 2; i <= a; i++) {
            boolean flag = isPrimeNumbers(i);
            if (flag) {
                Double b = (Math.pow(2, i) - 1) * Math.pow(2, (i - 1));
                int c = b.intValue();
                if (c == num) {
                    return true;
                }
                if (c > num) {
                    return false;
                }
            }
        }
        return false;

    }
}
