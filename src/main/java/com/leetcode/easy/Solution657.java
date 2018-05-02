package com.leetcode.easy;

/**
 *  初始位置 (0, 0) 处有一个机器人。给出它的一系列动作，判断这个机器人的移动路线是否形成一个圆圈，
 *  换言之就是判断它是否会移回到原来的位置。移动顺序由一个字符串表示。每一个动作都是由一个字符来表示的。
 *  机器人有效的动作有 R（右），L（左），U（上）和 D（下）。输出应为 true 或 false，表示机器人移动路线是否成圈。
 *
 * 示例 1:
 *   输入: "UD"
 *   输出: true
 *
 * 示例 2:
 *   输入: "LL"
 *   输出: false
 *
 * @author 阮雪峰
 * @date 2018/5/2 10:02
 */
public class Solution657 {
    public boolean judgeCircle(String moves) {
        int[] i = {0, 0};//(x,y)
        char[] arr = moves.toUpperCase().toCharArray();
        for (char c : arr) {
            switch (c) {
                case 'R':
                    i[0] += 1;
                    break;
                case 'L':
                    i[0] += -1;
                    break;
                case 'U':
                    i[1] += 1;
                    break;
                case 'D':
                    i[1] += -1;
                    break;
            }
        }
        return (i[0] == 0 && i[1] == 0);
    }
}
