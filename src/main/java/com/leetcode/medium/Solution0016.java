package com.leetcode.medium;

import java.util.Arrays;

/**
 * 给定一个包括 n 个整数的数组 nums 和 一个目标值 target。找出 nums 中的三个整数，使得它们的和与 target 最接近。返回这三个数的和。假定每组输入只存在唯一答案。
 *
 * 例如，给定数组 nums = [-1，2，1，-4], 和 target = 1.
 *
 * 与 target 最接近的三个数的和为 2. (-1 + 2 + 1 = 2).
 *
 * @author 阮雪峰
 * @date 2018/5/3 16:13
 */
public class Solution0016 {

    public static void main(String[] args) {
//        int[] nums = {0, 2, 1, -3};
//        int[] nums = {-1, 2, 1, -4};
//        int[] nums = {0, 0, 0};
        int[] nums = {1, 1, -1, -1, 3};
//        int[] nums = {1, 2, 4, 8, 16, 32, 64, 128};
//        int a = 82;
        int a = 3;
//        int a = -1;
//        int a = 1;
        System.out.println(threeSumClosest(nums, a));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int sum = target >= 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                int a = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) > Math.abs(target - a)) {
                    sum = a;
                }
                if (a > target) {
                    k--;
                } else {
                    j++;
                }
                //int b = a > target ? k-- : j++;
            }
        }
        return sum;
    }
}
