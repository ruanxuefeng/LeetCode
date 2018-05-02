package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 *   输入: S = "a1b2"
 *   输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 *   输入: S = "3z4"
 *   输出: ["3z4", "3Z4"]
 *
 *   输入: S = "12345"
 *   输出: ["12345"]
 *
 * @author 阮雪峰
 * @date 2018/5/2 10:12
 */
public class Solution784 {
    public List<String> letterCasePermutation(String S) {
        {
            if (S == null || "".equals(S)) {
                List<String> list = new ArrayList<String>();
                list.add("");
                return list;
            }
            char[] charArr = S.toCharArray();
            List<String> list = new ArrayList<String>();
            for (int i = charArr.length - 1; i >= 0; i--) {
                char c = charArr[i];
                List<String> listNew = new ArrayList<String>();
                String tempStr;
                if (c >= 'a' && c <= 'z') {
                    char C = (char) (c - 32);
                    if (i == charArr.length - 1) {
                        list.add(String.valueOf(c));
                        list.add(String.valueOf(C));
                    } else {
                        for (String s : list) {
                            tempStr = c + s;
                            listNew.add(tempStr);

                        }
                        for (String s : list) {
                            tempStr = C + s;
                            listNew.add(tempStr);
                        }
                        list = listNew;
                    }
                } else if (c >= 'A' && c <= 'Z') {
                    char C = (char) (c + 32);
                    if (i == charArr.length - 1) {
                        list.add(String.valueOf(c));
                        list.add(String.valueOf(C));
                    } else {
                        for (String s : list) {
                            tempStr = c + s;
                            listNew.add(tempStr);

                        }
                        for (String s : list) {
                            tempStr = C + s;
                            listNew.add(tempStr);
                        }
                        list = listNew;
                    }
                } else {
                    if (i == charArr.length - 1) {
                        list.add(String.valueOf(c));
                    } else {
                        for (String s : list) {
                            tempStr = c + s;
                            listNew.add(tempStr);
                        }
                        list = listNew;
                    }
                }

            }
            return list;
        }
    }
}
