package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 *  给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 * @author 阮雪峰
 * @date 2018/8/20 15:16
 */
public class Solution100 {

    public static void main(String[] args) {
        TreeNode p = new TreeNode(1);
        p.left = new TreeNode(2);
        p.right = new TreeNode(3);

        TreeNode q = new TreeNode(1);
        q.left = new TreeNode(2);
        q.right = new TreeNode(3);

        System.out.println(isSameTree(p, null));
    }

    public static boolean isSameTree(TreeNode p, TreeNode q) {
        boolean flag1 = p == q || (p != null && q != null && p.val == q.val);
        if (flag1) {
            if (p == null && q == null) {
                return true;
            }
            boolean flag2 = isSameTree(p == null ? null : p.left, q == null ? null : q.left);
            boolean flag3 = isSameTree(p == null ? null : p.right, q == null ? null : q.right);
            return flag2 & flag3;
        }
        return false;
    }
}
