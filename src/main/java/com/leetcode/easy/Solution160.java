package com.leetcode.easy;

import com.leetcode.common.ListNode;

import java.util.ArrayList;
import java.util.List;


/**
 *  编写一个程序，找到两个单链表相交的起始节点。
 *
 *
 *
 * 例如，下面的两个链表：
 *
 * A:          a1 → a2
 *                    ↘
 *                      c1 → c2 → c3
 *                    ↗
 * B:     b1 → b2 → b3
 * 在节点 c1 开始相交。
 *
 *
 *
 * 注意：
 *
 * 如果两个链表没有交点，返回 null.
 * 在返回结果后，两个链表仍须保持原有的结构。
 * 可假定整个链表结构中没有循环。
 * 程序尽量满足 O(n) 时间复杂度，且仅用 O(1) 内存。
 * @author 阮雪峰
 * @date 2018/9/10 13:06
 */
public class Solution160 {

    public static void main(String[] args) {
        ListNode node = new ListNode(5);
        node.next = new ListNode(10);
        node.next.next = new ListNode(11);

        ListNode headA = new ListNode(3);
        headA.next = new ListNode(7);
        headA.next.next = new ListNode(9);
        headA.next.next.next = node;

        ListNode headB = new ListNode(1);
        headB.next = node;
        System.out.println(node);
        System.out.println(getIntersectionNode(headA, headB));
    }

    public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        List<ListNode> listA = new ArrayList<>();
        ListNode node = headA;
        while (node != null) {
            listA.add(node);
            node = node.next;
        }
        List<ListNode> listB = new ArrayList<>();
        node = headB;
        while (node != null) {
            listB.add(node);
            node = node.next;
        }
        int a = listA.size() - 1;
        int b = listB.size() - 1;
        while (a >= 0 && b >= 0) {
            if (listA.get(a) == listB.get(b)) {
                node = listA.get(a);
            } else {
                break;
            }
            a--;
            b--;
        }
        return node;
    }
}
