package com.leetcode.easy;

/**
 *  颠倒给定的 32 位无符号整数的二进制位。
 *
 * 示例:
 *
 * 输入: 43261596
 * 输出: 964176192
 * 解释: 43261596 的二进制表示形式为 00000010100101000001111010011100 ，
 *      返回 964176192，其二进制表示形式为 00111001011110000010100101000000 。
 * 进阶:
 * 如果多次调用这个函数，你将如何优化你的算法？
 * @author 阮雪峰
 * @date 2018/8/23 14:46
 */
public class Solution190 {

    public static void main(String[] args) {
        System.out.println(reverseBits(4294967295L));
    }

    public static int reverseBits(Long n) {
        int res = 0;
        for (int i = 0; i < 32; i ++) {
            res <<= 1;
            res += n & 1;
            n >>= 1;
        }
        return res;
    }
}
