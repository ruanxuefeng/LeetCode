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
        System.out.println(getRow(2));
    }

    public static List<Integer> getRow(int rowIndex) {
        List<List<Integer>> lists = new ArrayList<>(rowIndex);
        List<Integer> list = new ArrayList<>(1);
        list.add(1);
        lists.add(list);
        for (int i = 2; i <= rowIndex+1; i++) {
            list = new ArrayList<>(i);
            for (int j = 0; j < i; j++) {
                if (j == 0 || j == (i - 1)) {
                    list.add(1);
                }else{
                    int a = lists.get(i - 2).get(j - 1);
                    int b = lists.get(i - 2).get(j);
                    list.add(a + b);
                }

            }
            lists.add(list);
        }
        return lists.get(rowIndex);
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
