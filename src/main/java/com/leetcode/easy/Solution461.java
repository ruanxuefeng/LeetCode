package com.leetcode.easy;

/**
 *  两个整数之间的汉明距离指的是这两个数字对应二进制位不同的位置的数目。
 *
 * 给出两个整数 x 和 y，计算它们之间的汉明距离。
 * 示例:
 *
 *   输入: x = 1, y = 4
 *   输出: 2
 *   解释:
 *   1   (0 0 0 1)
 *   4   (0 1 0 0)
 *        ↑   ↑
 *
 * 上面的箭头指出了对应二进制位不同的位置。
 *
 * @author 阮雪峰
 * @date 2018/4/28 9:40
 */
public class Solution461 {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int f = grid.length;
        int g = grid[0].length;
        for (int i = 0; i < f; i++) {
            for (int j = 0; j < g; j++) {
                if (grid[i][j] == 1) {
                    int a = i + 1;
                    int b = i - 1;
                    int c = j + 1;
                    int d = j - 1;
                    int e = 4;
                    e -= (a >= 0 && a < f) ? grid[a][j] : 0;
                    e -= (b >= 0 && b < f) ? grid[b][j] : 0;
                    e -= (c >= 0 && c < g) ? grid[i][c] : 0;
                    e -= (d >= 0 && d < g) ? grid[i][d] : 0;
                    sum += e;
                }

            }
        }
        return sum;
    }
}
