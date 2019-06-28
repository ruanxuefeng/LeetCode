package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 *
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 * @author 阮雪峰
 * @date 2018/8/23 13:48
 */
public class Solution0118 {
    public static void main(String[] args) {
        System.out.println(generate(8));

    }
    private static List<List<Integer>> generate(int numRows) {
        if (numRows <= 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> lists = new ArrayList<>(numRows);
        List<Integer> list = new ArrayList<>(1);
        list.add(1);
        lists.add(list);
        for (int i = 2; i <= numRows; i++) {
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
        return lists;
    }
}
