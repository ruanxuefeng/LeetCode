package com.leetcode.medium;

/**
 *  假设按照升序排序的数组在预先未知的某个点上进行了旋转。
 *
 * ( 例如，数组 [0,1,2,4,5,6,7] 可能变为 [4,5,6,7,0,1,2] )。
 *
 * 搜索一个给定的目标值，如果数组中存在这个目标值，则返回它的索引，否则返回 -1 。
 *
 * 你可以假设数组中不存在重复的元素。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 示例 1:
 *
 * 输入: nums = [4,5,6,7,0,1,2], target = 0
 * 输出: 4
 * 示例 2:
 *
 * 输入: nums = [4,5,6,7,0,1,2], target = 3
 * 输出: -1
 * @author 阮雪峰
 * @date 2018/5/14 13:41
 */
public class Solution0033 {

    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        System.out.println(search(nums, target));
    }

    public static int search(int[] nums, int target) {
        return search(nums, target, 0, nums.length - 1);
    }

    public static int search(int[] nums, int target, int i, int j) {
        while (i <= j) {
            if (nums[i] == target) {
                return i;
            } else if (nums[j] == target) {
                return j;
            }
            i++;
            j--;
        }
        return -1;
    }

    public static int search1(int[] nums, int target, int i, int j) {
        if (i > j) {
            return -1;
        } else if (nums[i] == target) {
            return i;
        } else if (nums[j] == target) {
            return j;
        } else {
            return search(nums, target, i + 1, j - 1);
        }
    }
}
