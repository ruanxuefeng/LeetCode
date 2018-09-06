package com.leetcode.easy;

import com.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 *  给定一个二叉树，检查它是否是镜像对称的。
 *
 * 例如，二叉树 [1,2,2,3,4,4,3] 是对称的。
 *
 *     1
 *    / \
 *   2   2
 *  / \ / \
 * 3  4 4  3
 * 但是下面这个 [1,2,2,null,3,null,3] 则不是镜像对称的:
 *
 *     1
 *    / \
 *   2   2
 *    \   \
 *    3    3
 * 呵呵哒
 * @author 阮雪峰
 * @date 2018/8/21 13:14
 */
public class Solution101 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(67);
        root.left.left = new TreeNode(18);
        root.left.left.left = new TreeNode(-1);
        root.left.left.left.right = new TreeNode(61);
        root.left.left.right = new TreeNode(-64);
        root.left.left.right.left = new TreeNode(-20);

        root.right = new TreeNode(67);
        root.right.right = new TreeNode(18);
        root.right.right.left = new TreeNode(-64);
        root.right.right.left.right = new TreeNode(-20);
        root.right.right.right = new TreeNode(-1);
        root.right.right.right.right = new TreeNode(61);

        System.out.println(isSymmetric(root));

    }

    public static boolean isSymmetric(TreeNode root) {
        return isSymmetric(root, root);
    }

    public static boolean isSymmetric(TreeNode r1, TreeNode r2) {
        if (r1 == null && r2 == null) {
            return true;
        }
        if (r1 == null || r2 == null) {
            return false;
        }
        return r1.val == r2.val && isSymmetric(r1.left, r2.right) && isSymmetric(r1.right, r2.left);
    }

}
