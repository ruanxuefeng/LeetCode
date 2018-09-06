package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 * @author 阮雪峰
 * @date 2018/8/23 13:57
 */
public class Solution119 {
    public static void main(String[] args) {
        System.out.println(getNum(10, 4));
    }

    public static List<Integer> getRow(int rowIndex) {
        if (rowIndex <= 0) {
            return new ArrayList<>();
        }
        List<Integer> list = new ArrayList<>(rowIndex);
        int a = 1, b = rowIndex;
        for (int i = 1; i <= (rowIndex % 2 == 0 ? rowIndex / 2 : (rowIndex + 1) / 2); i++) {
            if (i == 1) {
                list.add(a, 1);
                list.add(b, 1);
            } else if (i == 2) {
                list.add(a, b);
                list.add(b, b);
            } else {

            }

            a++;
            b--;
        }
        return list;
    }

    private static int getNum(int length, int index) {
        int sum = 1;
        index--;
        int a = (length - index - 1);
        for (int i = 0; i < a; i++) {
            sum += index;
            index++;
        }
        return sum;
    }
}
