package com.leetcode.easy;

/**
 *  给定一个字符串，验证它是否是回文串，只考虑字母和数字字符，可以忽略字母的大小写。
 *
 * 说明：本题中，我们将空字符串定义为有效的回文串。
 *
 * 示例 1:
 *
 * 输入: "A man, a plan, a canal: Panama"
 * 输出: true
 * 示例 2:
 *
 * 输入: "race a car"
 * 输出: false
 * @author 阮雪峰
 * @date 2018/9/7 13:14
 */
public class Solution0125 {
    public static void main(String[] args) {
//        String str = "A man, a plan, a canal: Panama";
        String str = "race a car";
        System.out.println(isPalindrome(str));
    }

    public static boolean isPalindrome(String s) {
        if (s == null) {
            return false;
        }
        if (s.isEmpty()) {
            return true;
        }
        s = s.toLowerCase();
        int i = 0, j = s.length() - 1;
        char empty = ' ';
        while (i < j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            boolean ciIsChar = (ci >= '0' && ci <= '9') || (ci >= 'a' && ci <= 'z');
//            boolean ciIsEmpty = ci == empty;
            if (!ciIsChar) {
                i++;
                continue;
            }

            boolean cjIsChar = (cj >= '0' && cj <= '9') || (cj >= 'a' && cj <= 'z');
//            boolean cjIsEmpty = cj == empty;
            if (!cjIsChar) {
                j--;
                continue;
            }
            if (ci != cj) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
