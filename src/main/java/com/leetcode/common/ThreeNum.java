package com.leetcode.common;

import java.util.ArrayList;
import java.util.List;

public class ThreeNum {
    int a;
    int b;
    int c;

    public ThreeNum(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public boolean is() {
        return a + b + c == 0;
    }

    public int sum() {
        return a + b + c;
    }

    public List<Integer> getList() {
        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        return list;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ThreeNum threeNum = (ThreeNum) o;
        return (a == threeNum.a && b == threeNum.b && c == threeNum.c)
                || (a == threeNum.a && b == threeNum.c && c == threeNum.b)

                || (a == threeNum.b && b == threeNum.c && c == threeNum.a)
                || (a == threeNum.b && b == threeNum.a && c == threeNum.c)

                || (a == threeNum.c && b == threeNum.b && c == threeNum.a)
                || (a == threeNum.c && b == threeNum.a && c == threeNum.b);
    }

    @Override
    public int hashCode() {
        return a + b + c;
    }
}
