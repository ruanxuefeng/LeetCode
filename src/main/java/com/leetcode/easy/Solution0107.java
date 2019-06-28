package com.leetcode.easy;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 *  给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 * @author 阮雪峰
 * @date 2018/9/6 15:18
 */
public class Solution0107 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(levelOrderBottom(root));
    }

    public static List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> lists = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        levelOrderBottom(root, lists, 0);
        for (List<Integer> list : lists) {
            result.add(0,list);
        }
        return result;
    }

    public static void levelOrderBottom(TreeNode node, List<List<Integer>> lists, int i) {
        if (node == null) {
            return;
        }
        List<Integer> list;
        if (i >= lists.size()) {
            list = new ArrayList<>();
            lists.add(list);
        } else {
            list = lists.get(i);
        }
        list.add(node.val);
        i++;
        levelOrderBottom(node.left, lists, i);
        levelOrderBottom(node.right, lists, i);
    }
}
