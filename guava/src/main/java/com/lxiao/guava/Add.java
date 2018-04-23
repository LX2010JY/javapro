package com.lxiao.guava;

import com.google.common.base.Optional;

public class Add {
    //普通add方法，当a为null时会报错
    public static Integer add(Integer a, Integer b) {
        return a + b;
    }
    public static Integer sum(Optional<Integer> a, Optional<Integer> b) {
        return a.get() + b.get();
    }
    public static void main(String[] args) {
        Integer a = null, b=20;
        //这样会报错
        System.out.println(add(a, b));
        Optional<Integer> anum = Optional.of(a);
        Optional<Integer> bnum = Optional.of(b);
        System.out.println(sum(anum, bnum));

    }
}
