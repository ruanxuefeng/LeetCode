package com.leetcode.medium;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

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
        node.next.next.next.next.next = new ListNode(6);

        ListNode result = swapPairs(node);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode node = head;
        //奇
        List<ListNode> list1 = new ArrayList<>();
        //偶
        List<ListNode> list2 = new ArrayList<>();
        int i = 1;
        while (node != null) {
            if (i % 2 == 1) {
                list1.add(node);
            } else {
                list2.add(node);
            }
            node = node.next;
            i++;
        }
        i = 0;
        while (i < list2.size()) {
            if (i == 0) {
                head = list2.get(0);
            }
            node = list2.get(i);
            node.next = list1.get(i);
            ListNode nextNode = null;
            if (i + 1 < list2.size()) {
                nextNode = list2.get(i + 1);
                node.next.next = node = nextNode;
            }
            i++;
        }
        if (list1.size() > list2.size()) {
            node.next.next = list1.get(list1.size() - 1);
        } else {
            node.next.next = null;
        }
        return head;
    }
}
