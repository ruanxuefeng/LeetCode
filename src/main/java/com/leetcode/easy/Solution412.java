package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 *  写一个程序，输出从 1 到 n 数字的字符串表示。
 *
 * 1. 如果 n 是3的倍数，输出“Fizz”；
 *
 * 2. 如果 n 是5的倍数，输出“Buzz”；
 *
 * 3.如果 n 同时是3和5的倍数，输出 “FizzBuzz”。
 * @author 阮雪峰
 * @date 2018/4/28 9:10
 */
public class Solution412 {

    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<String>();
        Integer i = 1;
        String str;
        String str1 = "FizzBuzz";
        String str2 = "Fizz";
        String str3 = "Buzz";

        while (i <= n) {
            if (i % 3 == 0 && i % 5 == 0) {
                str = str1;
            } else if (i % 3 == 0) {
                str = str2;
            } else if (i % 5 == 0) {
                str = str3;
            } else {
                str = i.toString();
            }
            list.add(str);
            i++;
        }
        return list;
    }
}
