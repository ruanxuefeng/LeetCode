package com.leetcode.easy;

import com.leetcode.common.ListNode;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution0206 {

    public static void main(String[] args) {
        ListNode node = ListNode.create(1, 2, 3, 4, 5, 6, 7, 8);
        ListNode.print(new Solution0206().reverseList2(node));
    }

    public ListNode reverseList2(ListNode head) {
        ListNode pre = null, temp, curr = head;
        while (curr != null) {
            temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }

    public ListNode reverseList1(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        } else {
            //1-2-3
            ListNode chain = reverseList1(head.next);
            head.next.next = head;
            head.next = null;
            return chain;
        }
    }
}
