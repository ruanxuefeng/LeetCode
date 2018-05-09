package com.leetcode.hard;

import com.leetcode.common.ListNode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 合并 k 个排序链表，返回合并后的排序链表。请分析和描述算法的复杂度。
 *
 * 示例:
 *
 * 输入:
 * [
 *   1->4->5,
 *   1->3->4,
 *   2->6
 * ]
 * 输出: 1->1->2->3->4->4->5->6
 * @author 阮雪峰
 * @date 2018/5/8 15:40
 */
public class Solution23 {

    public static void main(String[] args) {
        /*ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};*/

        /*ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(0);
        ListNode[] lists = {l1, l2};*/

        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(2);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(1);
        l2.next.next = new ListNode(2);

        ListNode[] lists = {l1, l2};
        ListNode result = mergeKLists(lists);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }

    }

    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode result = null;
        int j = 0;
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                if (result == null) {
                    result = lists[i];
                    j = i;
                } else if (result != null && result.val > lists[i].val) {
                    result = lists[i];
                    j = i;
                }
            }
        }
        if (result == null) {
            return result;
        }

        for (int i = 0; i < lists.length; i++) {
            ListNode node = lists[i];
            if (i != j && node != null) {
                ListNode pre = result, next = result.next;
                while (node != null) {
                    if (pre != null && next != null && pre.val <= node.val && node.val < next.val) {
                        ListNode temp = node.next;

                        pre.next = node;
                        node.next = next;

                        node = temp;
                    } else if (pre != null && next == null && node.val >= pre.val) {
                        ListNode temp = node.next;
                        node.next = null;
                        pre.next = node;
                        node = temp;
                    }

                    pre = pre.next;
                    next = pre.next;
                }
            }

        }
        return result;
    }

    public static ListNode mergeKLists1(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }
        ListNode result = new ListNode(Integer.MIN_VALUE), temp1 = result;

        Map<Integer, ListNode> map = new HashMap<>(lists.length);
        for (int i = 0; i < lists.length; i++) {
            if (lists[i] != null) {
                map.put(i, lists[i]);
            }
        }
        if (map.size() == 0) {
            return null;
        }
        while (map.size() > 0) {
            int j = 0;
            ListNode temp = new ListNode(Integer.MAX_VALUE);
            for (int i = 0; i < lists.length; i++) {
                ListNode node = map.get(i);
                if (node != null && node.val < temp.val) {
                    temp = node;
                    j = i;
                }
            }
            if (temp.next == null) {
                map.remove(j);
            } else {
                map.put(j, temp.next);
            }

            temp1.val = temp.val;
            if (map.size() > 0) {
                temp1.next = new ListNode(0);
                temp1 = temp1.next;
            }
        }
        return result;
    }
}
