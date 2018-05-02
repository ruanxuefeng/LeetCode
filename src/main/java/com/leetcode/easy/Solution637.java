package com.leetcode.easy;

import com.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *  给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 * @author 阮雪峰
 * @date 2018/5/2 10:00
 */
public class Solution637 {
    private static void getSum(Map<Integer, Map<String, Double>> map, TreeNode node, int deeply) {
        if (node == null) {
            return;
        }
        Map<String, Double> m = map.get(deeply);
        if (m == null) {
            m = new HashMap<String, Double>();
            m.put("sum", (double) node.val);
            m.put("count", 1.0);
            map.put(deeply, m);
        } else {
            m.put("sum", node.val + m.get("sum"));
            m.put("count", m.get("count") + 1);
        }

        getSum(map, node.left, deeply + 1);
        getSum(map, node.right, deeply + 1);
    }

    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<Double>();
        Map<Integer, Map<String, Double>> map = new HashMap<Integer, Map<String, Double>>(1);
        getSum(map, root, 0);
        int i = 0;
        while (map.get(i) != null) {
            Map<String, Double> m = map.get(i);
            double a = m.get("sum") / m.get("count");
            list.add(a);
            i++;
        }
        return list;
    }
}
