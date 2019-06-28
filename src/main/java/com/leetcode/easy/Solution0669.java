package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 *  给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。
 *  你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 *
 * @author 阮雪峰
 * @date 2018/5/2 10:03
 */
public class Solution0669 {
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) {
            return null;
        }
        TreeNode node = null;
        TreeNode tLeft = null;
        TreeNode tRight = null;
        if (root.val >= L && root.val <= R) {
            //root符合条件
            node = new TreeNode(root.val);
        }
        tLeft = trimBST(root.left, L, R);
        tRight = trimBST(root.right, L, R);

        if (node != null) {
            node.left = tLeft;
            node.right = tRight;
            return node;
        } else if (tLeft != null) {
            return tLeft;
        } else if (tRight != null) {
            return tRight;
        }
        return null;
    }
}
