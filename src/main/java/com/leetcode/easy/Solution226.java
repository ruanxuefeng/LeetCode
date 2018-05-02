package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 * 翻转二叉树
 * @author 阮雪峰
 * @date 2018/4/28 8:57
 */
public class Solution226 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        invertTree(root.left);
        invertTree(root.right);

        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;
        return root;
    }
}
