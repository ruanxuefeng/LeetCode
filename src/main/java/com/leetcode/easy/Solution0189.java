package com.leetcode.easy;

/**
 * 给定一个数组，将数组中的元素向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 * 示例 2:
 *
 * 输入: [-1,-100,3,99] 和 k = 2
 * 输出: [3,99,-1,-100]
 * 解释:
 * 向右旋转 1 步: [99,-1,-100,3]
 * 向右旋转 2 步: [3,99,-1,-100]
 * 说明:
 *
 * 尽可能想出更多的解决方案，至少有三种不同的方法可以解决这个问题。
 * 要求使用空间复杂度为 O(1) 的原地算法。
 * @author 阮雪峰
 * @date 2018/10/22 13:46
 */
public class Solution0189 {

    public static void main(String[] args) {
//        int[] nums = {1,2};
        int[] nums = {-1};
//        int[] nums = {17};
//        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 2);
//        rotate(nums, 3);
        for (int num : nums) {
            System.out.println(num);
        }
    }

    public static void rotate(int[] nums, int k) {
        while (k > nums.length) {
            k = k - nums.length;
        }

        /*if (nums.length == k || k <= 0) {
            return;
        }*/
        int[] nums1 = new int[k];
        int[] nums2 = new int[nums.length - k];

        int length = nums.length;
        for (int i = 0; i < k; i++) {
            nums1[i] = nums[length - 1 - i];
        }

        for (int i = 0; i < nums.length - k; i++) {
            nums2[i] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            if (i < k) {
                nums[i] = nums1[k - 1 - i];
            } else {
                nums[i] = nums2[i - k];
            }
        }
    }
}
