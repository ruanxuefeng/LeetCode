package com.leetcode.easy;

import java.util.Arrays;

/**
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。
 *
 * 说明：
 * 你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？
 *
 * 示例 1:
 *   输入: [2,2,1]
 *   输出: 1
 * 示例 2:
 *   输入: [4,1,2,1,2]
 *   输出: 4
 *
 * @author 阮雪峰
 * @date 2018/4/28 8:55
 */
public class Solution136 {

    /**
     *  花式解法
     * @author 阮雪峰
     * @date 2018/4/28 8:55
     */
    public int singleNumber(int[] nums) {
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }

    /**
     * 正常解法
     * @param nums
     * @return int
     * @throws
     * @author 阮雪峰
     * @date 2018/4/28 8:54
     */
    public int singleNumber1(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
            if (i + 1 >= nums.length) {
                return nums[i];
            }
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return 0;
    }
}
