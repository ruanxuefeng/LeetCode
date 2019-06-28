package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 *  给定一个链表，判断链表中是否有环。
 *
 * 进阶：
 * 你能否不使用额外空间解决此题？
 * @author 阮雪峰
 * @date 2018/9/7 13:39
 */
public class Solution0141 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        ListNode node = head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        head.next.next.next.next.next = node;
        System.out.println(hasCycle(head));
    }
    public static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode oneStep = head.next;
        ListNode twoStep = head.next.next;
        while (oneStep != twoStep) {
            if (oneStep == null || twoStep == null || twoStep.next == null) {
                return false;
            }
            oneStep = oneStep.next;
            twoStep = twoStep.next.next;
        }
        return true;
    }
}
