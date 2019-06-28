package com.leetcode.medium;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个链表，删除链表的倒数第 n 个节点，并且返回链表的头结点。
 *
 * 示例：
 * 给定一个链表: 1->2->3->4->5, 和 n = 2.
 * 当删除了倒数第二个节点后，链表变为 1->2->3->5.
 *
 * 说明：
 *   给定的 n 保证是有效的。
 *
 * 进阶：
 * 你能尝试使用一趟扫描实现吗？
 * @author 阮雪峰
 * @date 2018/5/8 9:12
 */
public class Solution0019 {
    public static void main(String[] args) {
        ListNode node = new ListNode(1);
        node.next = new ListNode(2);
//        node.next.next = new ListNode(3);
//        node.next.next.next = new ListNode(4);
//        node.next.next.next.next = new ListNode(5);

        ListNode node1 = removeNthFromEnd(node, 1);
        ListNode node2 = node1;
        while (node2 != null) {
            System.out.println(node2.val);
            node2 = node2.next;
        }
    }

    public static ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node);
            node = node.next;
        }
        int size = list.size();
        node = list.get(size - n);
        ListNode pre = size - n - 1 >= 0 ? list.get(size - n - 1) : null;
        if (pre == null) {
            head = node.next;
        } else {
            pre.next = node.next;
        }
        return head;
    }
}
