package com.leetcode.easy;

import com.leetcode.common.TreeNode;

/**
 *  给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 * @author 阮雪峰
 * @date 2018/9/6 15:50
 */
public class Solution0112 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.right = new TreeNode(1);

        System.out.println(hasPathSum(root, 22));

        root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(hasPathSum(root, 1));

        root = new TreeNode(1);
        System.out.println(hasPathSum(root, 1));

        root = new TreeNode(-2);
        root.right = new TreeNode(-3);
        System.out.println(hasPathSum(root, -5));

    }

    public static boolean hasPathSum(TreeNode root, int sum) {
        return hasPathSum(root, sum, 0);
    }

    public static boolean hasPathSum(TreeNode node, int sum, int pathSum) {
        if (node == null) {
            return false;
        } else {
            pathSum = pathSum + node.val;
            return (sum == pathSum && node.left == null && node.right == null)
                    || hasPathSum(node.left, sum, pathSum)
                    || hasPathSum(node.right, sum, pathSum);
        }
    }
}
