package com.leetcode.easy;

/**
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * @author 阮雪峰
 * @date 2018/4/23 13:18
 */
public class Solution0001 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
//        int[] nums = {2, 5, 5, 11};
        int target = 10;
        int[] result = twoSum(nums, target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = {0, 0};
        int a = 0;
        int i = 0, j = nums.length - 1;
        while (i < j) {
            a = nums[i] + nums[j];
            if (a == target) {
                result[0] = i;
                result[1] = j;
            } else if (a > target) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    public static int[] twoSum1(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;
                }
            }
        }
        return result;
    }
}
