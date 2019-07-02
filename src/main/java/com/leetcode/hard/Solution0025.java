package com.leetcode.hard;

import com.leetcode.common.ListNode;

/**
 * 给你一个链表，每 k 个节点一组进行翻转，请你返回翻转后的链表。
 * <p>
 * k 是一个正整数，它的值小于或等于链表的长度。
 * <p>
 * 如果节点总数不是 k 的整数倍，那么请将最后剩余的节点保持原有顺序。
 * <p>
 * 示例 :
 * <p>
 * 给定这个链表：1->2->3->4->5
 * <p>
 * 当 k = 2 时，应当返回: 2->1->4->3->5
 * <p>
 * 当 k = 3 时，应当返回: 3->2->1->4->5
 * <p>
 * 说明 :
 * <p>
 * 你的算法只能使用常数的额外空间。
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-nodes-in-k-group
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author 阮雪峰
 * @date 2019年6月28日14:15:19
 */
public class Solution0025 {

    public static void main(String[] args) {
        Solution0025 solution = new Solution0025();
        ListNode node = ListNode.create(1,2,3,4,5,6);
        ListNode.print(solution.reverse(node));
    }

    public ListNode reverseKGroup2(ListNode head, int k) {
        int index = 1;
        ListNode node, next, reverseLast, reverseLastNext, last, result = head;
        node = next = last = head;
        while (next != null) {
            if (index % k == 0) {
                reverseLast = next;
                reverseLastNext = reverseLast.next;
                reverseLast.next = null;
                ListNode reverse = reverse(node);
                if (index == k) {
                    result = reverse;
                } else {
                    last.next = reverse;
                }
                next = reverseLastNext;
                last = node;
                node = reverseLastNext;
            } else {
                next = next.next;
            }
            index++;
        }
        if (node != null && index > k) {
            last.next = node;
        }
        return result;
    }

    public ListNode reverseKGroup1(ListNode head, int k) {
        if (head != null) {
            ListNode reverseLast = head, reverseLastNext;
            int i = 1;
            while (reverseLast.next != null && i < k) {
                reverseLast = reverseLast.next;
                i++;
            }
            reverseLastNext = reverseLast.next;
            if (i != k) {
                return head;
            } else {
                ListNode chain = reverseKGroup1(reverseLastNext, k);
                reverseLast.next = null;
                reverse(head);
                head.next = chain;
                return reverseLast;
            }
        } else {
            return null;
        }
    }

    public ListNode reverse(ListNode node) {
        if (node.next == null) {
            return node;
        } else {
            //1-2-3
            ListNode chain = reverse(node.next);
            node.next.next = node;
            node.next = null;
            return chain;
        }
    }
}
