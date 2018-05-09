package com.leetcode.easy;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 * @author 阮雪峰
 * @date 2018/5/8 9:52
 */
public class Solution20 {
    public static void main(String[] args) throws InterruptedException {
        String str = "{[]}";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) throws InterruptedException {
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (c.equals(')') || c.equals('}') || c.equals(']')) {
                if (!list.isEmpty()) {
                    Character last = list.removeLast();
                    if ((c.equals(')') && !last.equals('('))) {
                        return false;
                    }
                    if ((c.equals('}') && !last.equals('{'))) {
                        return false;
                    }
                    if ((c.equals(']') && !last.equals('['))) {
                        return false;
                    }
                } else {
                    return false;
                }

            } else {
                list.add(c);
            }
        }
        return list.isEmpty();
    }
}
