package com.leetcode.medium;

/**
 *  给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 *
 * 你的算法时间复杂度必须是 O(log n) 级别。
 *
 * 如果数组中不存在目标值，返回 [-1, -1]。
 *
 * 示例 1:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 *
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 * @author 阮雪峰
 * @date 2018/5/14 13:56
 */
public class Solution34 {

    public static void main(String[] args) {
//        int[] nums = {1, 2, 2, 3, 4, 4, 4};
//        int[] nums = {1, 2, 2};
        int[] nums = {1, 4};
//        int[] nums = {1, 2};
//        int[] nums = {1};
//        int[] nums = {};
//        int[] nums = {5, 7, 7, 7, 7, 7, 7, 8, 8, 8, 8, 8, 8, 8, 8, 10};
        int target = 1;
        System.out.println(searchRange(nums, target)[0]);
        System.out.println(searchRange(nums, target)[1]);
    }

    public static int[] searchRange(int[] nums, int target) {
        if (nums.length == 0 || nums[nums.length - 1] < target || target < nums[0]) {
            int[] result = {-1, -1};
            return result;
        } else if (nums.length == 1 && nums[0] == target) {
            int[] result = {0, 0};
            return result;
        } else {
            return searchRange(nums, target, 0, nums.length - 1);
        }
    }

    public static int[] searchRange(int[] nums, int target, int i, int j) {
        while (j - i >= 2) {
            int a = (i + j) / 2;
            if (nums[a] == target) {
                int b = a, c = a;
                while (true) {
                    if (b >= 1 && nums[b - 1] == target) {
                        b--;
                    }
                    if (c < nums.length - 1 && nums[c + 1] == target) {
                        c++;
                    }
                    if ((b == 0 || nums[b - 1] != target) && (c == nums.length - 1 || nums[c + 1] != target)) {
                        int[] result = {b, c};
                        return result;
                    }
                }
            } else if (nums[a] > target) {
                j = a;
            } else {
                i = a;
            }
        }
        int b = nums[i] == target ? i : -1;
        int c = nums[j] == target ? j : -1;
        if (b == -1 && c == -1) {
            int[] result = {-1, -1};
            return result;
        } else if (b != -1 && c != -1) {
            int[] result = {b, c};
            return result;
        } else if (b == -1 && c != -1) {
            int[] result = {c, c};
            return result;
        } else {
            int[] result = {b, b};
            return result;
        }
    }

    public static int[] searchRange2(int[] nums, int target, int i, int j) {
        int[] result = {-1, -1};
        while (true) {
            if (nums[i] != target) {
                i++;
            } else {
                result[0] = i;
            }

            if (nums[j] != target) {
                j--;
            } else {
                result[1] = j;
            }
            if (i > j || (result[0] != -1 && result[1] != -1)) {
                break;
            }
        }
        return result;
    }

    public static int[] searchRange1(int[] nums, int target, int i, int j) {
        if ((j - i) == 1 && nums[i] != target && nums[j] != target) {
            int[] result = {-1, -1};
            return result;
        } else if ((j - i) == 1 || (nums[i] == target && nums[j] == target)) {
            int b = nums[i] == target ? i : -1;
            int c = nums[j] == target ? j : -1;
            if (b == -1 && c == -1) {
                int[] result = {-1, -1};
                return result;
            } else if (b != -1 && c != -1) {
                int[] result = {b, c};
                return result;
            } else if (b == -1 && c != -1) {
                int[] result = {c, c};
                return result;
            } else {
                int[] result = {b, b};
                return result;
            }
        } else {
            int a = (i + j) / 2;
            if (nums[a] == target) {
                int b = a, c = a;
                while (true) {
                    if (b >= 1 && nums[b - 1] == target) {
                        b--;
                    }
                    if (c < nums.length - 1 && nums[c + 1] == target) {
                        c++;
                    }
                    if ((b == 0 || nums[b - 1] != target) && (c == nums.length - 1 || nums[c + 1] != target)) {
                        break;
                    }
                }
                int[] result = {b, c};
                return result;
            } else if (nums[a] > target) {
                return searchRange(nums, target, i, a);
            } else {
                return searchRange(nums, target, a, j);
            }
        }
    }
}
