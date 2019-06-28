package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * @author 阮雪峰
 * @date 2018/5/8 14:56
 */
public class Solution0021 {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(l1, l2);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0), temp = result;

        ListNode node1 = l1;
        ListNode node2 = l2;
        if (node1 != null && node2 != null) {
            return null;
        }
        while (node1 != null || node2 != null) {

            if (node1 != null && node2 != null && node1.val < node2.val) {
                temp.val = node1.val;
                node1 = node1.next;
            } else if (node1 != null && node2 != null && node1.val >= node2.val) {
                temp.val = node2.val;
                node2 = node2.next;
            } else if (node1 != null && node2 == null) {
                temp.val = node1.val;
                node1 = node1.next;
            } else if (node1 == null && node2 != null) {
                temp.val = node2.val;
                node2 = node2.next;
            }
            if (node1 != null || node2 != null) {
                temp.next = new ListNode(0);
                temp = temp.next;
            }

        }
        return result;
    }
}

