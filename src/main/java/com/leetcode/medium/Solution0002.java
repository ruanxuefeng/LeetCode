package com.leetcode.medium;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 *
 * 示例：
 *  输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *  输出：7 -> 0 -> 8
 *  原因：342 + 465 = 807
 *
 * @author 阮雪峰
 * @date 2018/4/23 13:43
 */
public class Solution0002 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(5);
//        l1.next = new ListNode(4);
//        l1.next.next = new ListNode(7);

        ListNode l2 = new ListNode(5);
//        l2.next = new ListNode(6);
//        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);
        while (true) {
            System.out.println(result.val);
            result = result.next;
            if (result == null) {
                break;
            }
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int a = 0, b;
        ListNode temp1 = l1, temp2 = l2, temp3 = result;
        while (true) {
            int integer = (temp1 == null ? 0 : temp1.val) + (temp2 == null ? 0 : temp2.val);

            b = integer % 10;
            if ((b + a) >= 10) {
                temp3.val = (b + a) % 10;
                a = integer / 10 + 1;
            } else {
                temp3.val = b + temp3.val;
                a = integer / 10;
            }


            temp1 = temp1 == null ? null : temp1.next;
            temp2 = temp2 == null ? null : temp2.next;

            if (temp1 != null || temp2 != null || a > 0) {
                temp3.next = new ListNode(a);
                temp3 = temp3.next;
            }

            if (temp1 == null && temp2 == null) {
                break;
            }
        }

        return result;
    }

    /*public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        int a = 0, b;
        List<Integer> list = new ArrayList<Integer>();
        ListNode temp1 = l1, temp2 = l2, temp3 = result;
        while (true) {
            list.add((temp1 == null ? 0 : temp1.val) + (temp2 == null ? 0 : temp2.val));
            temp1 = temp1 == null ? null : temp1.next;
            temp2 = temp2 == null ? null : temp2.next;
            if (temp1 == null && temp2 == null) {
                break;
            }
        }
        System.out.println(list);
        int i = 0;
        for (Integer integer : list) {

            b = integer % 10;

            if (b + a >= 10) {
                temp3.val = (b + a) % 10;
                a = integer / 10 + (b + a) / 10;
            } else {
                temp3.val = b + a;
                a = integer / 10;
            }


            i++;
            if (i <= list.size() - 1) {
                temp3.next = new ListNode(0);
                temp3 = temp3.next;
            } else if (a > 0) {
                temp3.next = new ListNode(a);
            }
        }
        return result;
    }*/
}
