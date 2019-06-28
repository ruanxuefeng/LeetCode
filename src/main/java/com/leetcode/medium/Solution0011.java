package com.leetcode.medium;

/**
 *  给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。画 n 条垂直线，使得垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 *
 * 注意：你不能倾斜容器，n 至少是2。
 *
 * 这个优化比较简单o_O!!!!
 *
 * @author 阮雪峰
 * @date 2018/4/27 13:51
 */
public class Solution0011 {
    public static void main(String[] args) {
        int[] a = {5, 3, 6, 4, 36, 9, 1, 45, 8};
//        int[] a = {1, 1};
        System.out.println(maxArea(a));
        System.out.println(maxArea2(a));
        System.out.println(maxArea3(a));
    }

    /**
     * 最优版本 7ms
     * @param height
     * @return int
     * @throws
     * @author 阮雪峰
     * @date 2018/4/27 14:19
     */
    public static int maxArea(int[] height) {
        int result = 0;
        int i = 0, j = height.length - 1, hei, area;
        while (i < j) {
            int width = (j - i);
            if (height[i] >= height[j]) {
                hei = height[j];
                j--;
            } else {
                hei = height[i];
                i++;
            }
            area = width * hei;
            if (result < area) {
                result = area;
            }
        }
        return result;
    }

    public static int maxArea3(int[] height) {
        /**
         * 14ms
         * @param height
         * @return int
         * @throws
         * @author 阮雪峰
         * @date 2018/4/27 14:19
         */
        int result = 0;
        int i = 0, j = height.length - 1, hei, area;
        while (i < j) {
            if (height[i] >= height[j]) {
                hei = height[j];
                area = (j - i) * hei;
                j--;
            } else {
                hei = height[i];
                area = (j - i) * hei;
                i++;
            }
            if (result < area) {
                result = area;
            }
        }
        return result;
    }

    /**
     * 虽然正解但是慢
     * @param height
     * @return int
     * @throws
     * @author 阮雪峰
     * @date 2018/4/27 14:07
     */
    public static int maxArea2(int[] height) {
        int result = 0;
        int i = 0, j = height.length - 1;
        while (i < j) {
            result = Math.max(result, (j - i) * Math.min(height[i], height[j]));
            if (height[i] >= height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return result;
    }

    /**
     * 暴力解
     * @param height
     * @return int
     * @throws
     * @author 阮雪峰
     * @date 2018/4/27 14:00
     */
    public static int maxArea1(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length - 1; i++) {
            for (int j = 0; j < height.length; j++) {
                result = Math.max(result, (j - i) * Math.min(height[i], height[j]));
            }
        }
        return result;
    }
}
