package com.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 * @author 阮雪峰
 * @date 2018/5/3 17:00
 */
public class Solution17 {

    public static void main(String[] args) {
        System.out.println(letterCombinations("23"));
    }

    public static List<String> letterCombinations(String digits) {
        Map<Character, Character[]> map = new HashMap<>(7);

        Character key2 = '2';
        Character[] value2 = {'a', 'b', 'c'};
        map.put(key2, value2);

        Character key3 = '3';
        Character[] value3 = {'d', 'e', 'f'};
        map.put(key3, value3);

        Character key4 = '4';
        Character[] value4 = {'g', 'h', 'i'};
        map.put(key4, value4);

        Character key5 = '5';
        Character[] value5 = {'j', 'k', 'l'};
        map.put(key5, value5);

        Character key6 = '6';
        Character[] value6 = {'m', 'n', 'o'};
        map.put(key6, value6);

        Character key7 = '7';
        Character[] value7 = {'p', 'q', 'r', 's'};
        map.put(key7, value7);

        Character key8 = '8';
        Character[] value8 = {'t', 'u', 'v'};
        map.put(key8, value8);

        Character key9 = '9';
        Character[] value9 = {'w', 'x', 'y', 'z'};
        map.put(key9, value9);

        return letterCombinations1(digits, map);
    }

    public static List<String> letterCombinations(String digits, int i, Map<Character, Character[]> map) {
        List<String> result = new ArrayList<>();
        if (i == digits.length() - 1) {
            for (Character character : map.get(digits.charAt(i))) {
                result.add(character.toString());
            }
        } else {
            List<String> r = letterCombinations(digits, i + 1, map);
            for (Character character : map.get(digits.charAt(i))) {
                for (String s : r) {
                    result.add(character.toString() + s);
                }
            }
        }
        return result;

    }

    public static List<String> letterCombinations1(String digits, Map<Character, Character[]> map) {
        List<String> result = new ArrayList<>();
        int i = 0;
        for (char c : digits.toCharArray()) {
            Character[] characters = map.get(c);
            List<String> temp = new ArrayList<>();
            for (Character character : characters) {
                if (i == 0) {
                    temp.add(character.toString());
                } else {
                    for (String s : result) {
                        temp.add(s + character);
                    }
                }
            }
            result = temp;
            i++;
        }

        return result;
    }
}
