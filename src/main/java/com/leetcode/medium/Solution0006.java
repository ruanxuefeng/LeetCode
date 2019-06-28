package com.leetcode.medium;

/**
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 * P   A   H   N
 * A P L S I I G
 * Y   I   R
 * 之后从左往右，逐行读取字符："PAHNAPLSIIGYIR"
 *
 * 实现一个将字符串进行指定行数变换的函数:
 *  string convert(string s, int numRows);
 * 示例 1:
 *  输入: s = "PAYPALISHIRING", numRows = 3
 *  输出: "PAHNAPLSIIGYIR"
 * 示例 2:
 *  输入: s = "PAYPALISHIRING", numRows = 4
 *  输出: "PINALSIGYAHRPI"
 *         PINALSIGYAHRPI
 * P   I   N
 * A L S I G
 * Y A H R
 * P   I
 *
 *
 * ABCDEFGHIJKLMNOPQRSTUVWXYZ   5
 * A0    I8      Q16     Y24
 * B1 H7 J9  P15 R17 X23 Z25
 * C2 G6 K10 O14 S18 W22
 * D3 F5 L11 N13 T19 V21
 * E4    M12     U20
 *
 * AIQYBHJPRXZCGKOSWDFLNTVEMU
 *
 * 0		8		16		24				8	0
 * 1	7	9	15	17	23	25				6	2
 * 2	6	10	14	18	22					4	4
 * 3	5	11	13	19	21					2	6
 * 4		12		20						0	8
 *
 * @author 阮雪峰
 * @date 2018/4/25 16:06
 */
public class Solution0006 {

    public static void main(String[] args) {
        System.out.println(convert("ABCDEFGHIJKLMNOPQRSTUVWXYZ", 5));
//        System.out.println(convert("PAYPALISHIRING", 4));
//        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        StringBuilder result = new StringBuilder();
        if (numRows == 1) {
            return result.append(s).toString();
        }
        int i = 0;
        int j = 0;
        int a, b, k;
        a = k = numRows + numRows - 2;
        while (result.length() < s.length()) {
            result.append(s.charAt(i));
            if (j == 0 || j == numRows - 1) {
                i = i + a;
            } else {
                if (i < s.length()) {
//                    result.append(s.charAt(i));
                    b = i;
                    i = i + k;
                    if (i < s.length()) {
                        result.append(s.charAt(i));
                    }
                    i = b + a;
                }
            }
            if (i >= s.length()) {
                j++;
                i = j;
                k -= 2;
            }
        }
        return result.toString();
    }
}
