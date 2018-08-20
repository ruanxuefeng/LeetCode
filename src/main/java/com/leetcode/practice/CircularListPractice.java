package com.leetcode.practice;

import com.leetcode.common.ListNode;

/**
 *  循环链表练习
 * @author 阮雪峰
 * @date 2018/6/8 9:17
 */
public class CircularListPractice {

    public static void main(String[] args) {
        int length = 15;
        ListNode head, node, circularNode = null;
        head = node = new ListNode(1);

        int circularIndex = 5;

        for (int i = 2; i <= length; i++) {
            node.next = new ListNode(i);
            node = node.next;
            if (i == circularIndex) {
                circularNode = node;
            }
        }
        node.next = head;
        System.out.println(isCircularList(head));
    }

    private static boolean isCircularList(ListNode node){
        ListNode stepOne = node.next;
        ListNode stepTwo = node.next.next;
        while (stepOne != stepTwo) {
            if (stepTwo == null || stepTwo.next == null) {
                return false;
            }
            stepOne = stepOne.next;
            stepTwo = stepTwo.next.next;
        }

        return true;
    }
}
