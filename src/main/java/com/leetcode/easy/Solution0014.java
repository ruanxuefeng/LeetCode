package com.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *   输入: ["flower","flow","flight"]
 *   输出: "fl"
 *
 * 示例 2:
 *   输入: ["dog","racecar","car"]
 *   输出: ""
 * 解释: 输入不存在公共前缀。
 *
 * 说明:
 * 所有输入只包含小写字母 a-z 。
 * @author 阮雪峰
 * @date 2018/5/3 9:42
 */
public class Solution0014 {

    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
//        String[] strs = {"dog", "racecar", "car"};
//        String[] strs = {"dog", "", "car"};
        String[] strs = {"aca", "cba"};
        System.out.println(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder result = new StringBuilder();
        if (strs.length == 0) {
            return "";
        }
        String s = strs[0];
        for (int i = 0; i < s.toCharArray().length; i++) {
            Set<Character> set = new HashSet();
            for (String str : strs) {
                if (i < str.length()) {
                    set.add(str.charAt(i));
                } else {
                    return result.toString();
                }
            }
            if (set.size() == 1) {
                result.append(s.charAt(i));
            } else {
                return result.toString();
            }
        }
        return result.toString();
    }

}
