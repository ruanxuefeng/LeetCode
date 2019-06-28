package com.leetcode.easy;

/**
 *  给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 *
 * 示例 1:
 *
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * 示例 2:
 *
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * 示例 3:
 *
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * 示例 4:
 *
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * @author 阮雪峰
 * @date 2018/5/14 15:16
 */
public class Solution0035 {
    public static void main(String[] args) {
//        int[] nums = {1, 3, 5, 6};
//        int target = 5;
//        int[] nums = {1, 3, 5, 6};
        int[] nums = {};
        int target = 0;
        System.out.println(searchInsert(nums, target));
    }

    public static int searchInsert(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        if (target <= nums[0]) {
            return 0;
        }
        if (target > nums[nums.length - 1]) {
            return nums.length;
        }
        int i = 1;
        while (true) {
            if (target > nums[i - 1] && target <= nums[i]) {
                return i;
            }
            i++;
        }
    }
}
