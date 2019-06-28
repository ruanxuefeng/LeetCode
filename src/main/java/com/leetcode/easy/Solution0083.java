package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 *  给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 *
 * 示例 1:
 *
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 *
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 * @author 阮雪峰
 * @date 2018/8/20 14:38
 */
public class Solution0083 {

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(1);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next = new ListNode(4);
        head.next.next.next.next.next.next.next = new ListNode(4);
        deleteDuplicates(head);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode deleteDuplicates(ListNode head) {

        ListNode temp = head;
        while (true) {
            if (temp == null || temp.next == null) {
                break;
            } else {
                if (temp.val == temp.next.val) {
                    temp.next = temp.next.next;
                }else {
                    temp = temp.next;
                }
            }
        }
        return head;
    }
}
