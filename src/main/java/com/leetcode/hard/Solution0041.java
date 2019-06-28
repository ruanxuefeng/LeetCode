package com.leetcode.hard;

import java.util.Arrays;

/**
 *  给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 *
 * 示例 1:
 *
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 *
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 *
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 * @author 阮雪峰
 * @date 2018/5/22 13:18
 */
public class Solution0041 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 0};
//        int[] nums = {3, 4, -1, 1};
//        int[] nums = {7, 8, 9, 11, 12};
        System.out.println(firstMissingPositive(nums));
    }

    public static int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int result = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                continue;
            } else {
                if (nums[i] == result) {
                    result++;
                }
            }
        }
        return result;
    }
}
