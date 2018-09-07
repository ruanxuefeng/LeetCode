package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *  设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 * @author 阮雪峰
 * @date 2018/9/7 14:24
 */
public class Solution155 {

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
       /* minStack.push(2);
        minStack.push(0);
        minStack.push(3);
        minStack.push(0);
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());
        minStack.pop();
        System.out.println(minStack.getMin());*/
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.getMin());
        minStack.pop();
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.getMin());
    }

    static class MinStack {

        List<Integer> list;
        Integer min = null;
        int length;

        /** initialize your data structure here. */
        public MinStack() {
            list = new ArrayList<>(16);
            length = 0;
        }

        public void push(int x) {
            list.add(x);
            length++;
            findMin();
        }

        public void pop() {
            if (length > 0) {
                int top = list.remove(length - 1);
                if (min != null && top == min) {
                    min = null;
                }
                length--;
            }
        }

        public int top() {
            return list.get(length - 1);
        }

        public int getMin() {
            if (min == null) {
                findMin();
            }
            return min;
        }

        private void findMin() {
            if (length > 0) {
                if (min == null) {
                    min = list.get(0);
                    for (Integer integer : list) {
                        if (integer < min) {
                            min = integer;
                        }
                    }
                } else {
                    min = min > list.get(length - 1) ? list.get(length - 1) : min;
                }

            }
        }
    }
}
