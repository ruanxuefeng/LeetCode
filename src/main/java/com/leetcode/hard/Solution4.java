package com.leetcode.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 给定两个大小为 m 和 n 的有序数组 nums1 和 nums2 。
 * 请找出这两个有序数组的中位数。要求算法的时间复杂度为 O(log (m+n)) 。
 *
 * 示例 1:
 *  nums1 = [1, 3]
 *  nums2 = [2]
 *  中位数是 2.0
 *
 * 示例 2:
 *  nums1 = [1, 2]
 *  nums2 = [3, 4]
 *
 *  中位数是 (2 + 3)/2 = 2.5
 *
 * @author 阮雪峰
 * @date 2018/4/25 10:02
 */
public class Solution4 {
    public static void main(String[] args) {
//        int[] nums1={1, 3};
//        int[] nums2={2};
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};

        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();
        for (int i : nums1) {
            list.add(i);
        }
        for (int i : nums2) {
            list.add(i);
        }
        Collections.sort(list);
        int size = list.size();
        return size % 2 == 0 ?  ((double)(list.get(size / 2) + list.get(size / 2 - 1)) / 2) : list.get((size - 1) / 2);
    }
}
