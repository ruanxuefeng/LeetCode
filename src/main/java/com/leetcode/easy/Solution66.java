package com.leetcode.easy;

import java.util.Arrays;

/**
 *  给定一个非负整数组成的非空数组，在该数的基础上加一，返回一个新的数组。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 *
 * 示例 1:
 *
 * 输入: [1,2,3]
 * 输出: [1,2,4]
 * 解释: 输入数组表示数字 123。
 * 示例 2:
 *
 * 输入: [4,3,2,1]
 * 输出: [4,3,2,2]
 * 解释: 输入数组表示数字 4321。
 * @author 阮雪峰
 * @date 2018/8/20 10:45
 */
public class Solution66 {

    public static void main(String[] args) {
//        int[] digits = {9,9};
        int[] digits = {1,2,3};
        int[] a = plusOne(digits);
        for (int i : a) {
            System.out.println(i);
        }
    }

    public static int[] plusOne(int[] digits) {
        int j = 1;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 < 10) {
                digits[i] = digits[i] + j;
                j = 0;
                break;
            } else {
                digits[i] = 0;
            }
        }
        if (j == 1) {
            int[] digits1 = Arrays.copyOf(digits, digits.length + 1);
            digits1[0] = j;
            return digits1;
        }else {
            return digits;
        }
    }
}
