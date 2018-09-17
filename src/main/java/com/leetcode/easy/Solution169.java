package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 *  给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 * @author 阮雪峰
 * @date 2018/9/14 16:03
 */
public class Solution169 {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement1(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(16);
        for (int num : nums) {
            int count = map.merge(num, 1, (old, next) -> old + 1);
            if (count > nums.length / 2) {
                return num;
            }
        }
        return 0;
    }

    /**
     * 令我颤抖的代码
     * @param nums
     * @return int
     * @author 阮雪峰
     * @date 2018/9/14 17:23
     */
    public static int majorityElement(int[] nums) {
        int a = nums[0];
        int count = 0;
        for (int num : nums) {
            if (num == a) {
                count++;
            }else {
                count--;
                if (count == 0) {
                    a = num;
                    count = 1;
                }
            }
        }
        return a;
    }

}
