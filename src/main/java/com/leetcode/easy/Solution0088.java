package com.leetcode.easy;

/**
 *  给定两个有序整数数组 nums1 和 nums2，将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
 *
 * 说明:
 *
 * 初始化 nums1 和 nums2 的元素数量分别为 m 和 n。
 * 你可以假设 nums1 有足够的空间（空间大小大于或等于 m + n）来保存 nums2 中的元素。
 * 示例:
 *
 * 输入:
 * nums1 = [1,2,3,0,0,0], m = 3
 * nums2 = [2,5,6],       n = 3
 *
 * 输出: [1,2,2,3,5,6]
 * @author 阮雪峰
 * @date 2018/8/20 14:55
 */
public class Solution0088 {
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
//        int[] nums1 = {1,2,3};
//        int[] nums1 = {0,0,0};
        int[] nums2 = {2, 5, 6};
//        int[] nums2 = {};
        merge(nums1, 3, nums2, 3);
        for (int i : nums1) {
            System.out.println(i);
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (true) {
            if (j == n) {
                break;
            }
            if (i == m) {
                while (i < nums1.length) {
                    nums1[i] = nums2[j];
                    i++;
                    j++;
                }
                break;
            }
            if (nums1[i] > nums2[j]) {
                int length = m;
                while (length > i) {
                    nums1[length] = nums1[length - 1];
                    length--;
                }
                nums1[i] = nums2[j];
                j++;
                m++;
            }
            i++;

        }
    }
}
