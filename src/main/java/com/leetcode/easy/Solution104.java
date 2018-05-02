package com.leetcode.easy;

import com.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 *  给定一个二叉树，找出其最大深度。
 *
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例：
 *   给定二叉树 [3,9,20,null,null,15,7]，
 *
 * @author 阮雪峰
 * @date 2018/4/28 8:53
 */
public class Solution104 {

    private static void maxDeep(TreeNode root, int deep, Map<String, Integer> map) {
        if (root == null) {
            return;
        }
        int a = deep + 1;
        map.put("maxDeep", Math.max(a, map.get("maxDeep")));
        maxDeep(root.right, a, map);
        maxDeep(root.left, a, map);
    }

    public int maxDepth(TreeNode root) {
        Map<String, Integer> map = new HashMap<String, Integer>(2);
        int deep = 0;
        map.put("maxDeep", deep);
        maxDeep(root, deep, map);
        return map.get("maxDeep");
    }
}
