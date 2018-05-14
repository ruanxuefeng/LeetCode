package com.leetcode.medium;

import com.leetcode.common.ListNode;

/**
 *  给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 * 说明:
 *
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * @author 阮雪峰
 * @date 2018/5/9 15:26
 */
public class Solution24 {

    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
        node.next.next = new ListNode(3);
        node.next.next.next = new ListNode(4);
        node.next.next.next.next = new ListNode(5);

        ListNode result = swapPairs(node);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode node = head, temp;
        int j = 1;
        while (node != null) {
            if (j == 1) {
                if (head.next != null) {
                    ListNode node1 = head;
                    ListNode node2 = head.next;
                    ListNode node3 = node2.next;

                    node2.next = null;
                    head = node2;
                    node2.next = node1;
                    node1.next = node3;

                    node = node3;
                }
            } else {
                ListNode next = node.next;
                ListNode node1 = next.next;

                next.next = node;
                node.next = node1;
                j++;
            }

        }
        return head;
    }
}
