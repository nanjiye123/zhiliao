package com.zhiliao.coupon;

import java.util.ArrayList;
import java.util.List;

public class test1 {


    public static void main(String[] args) {
        List<String> sourceList = new ArrayList<>();
        for (int i = 0; i<10; i++) {
            sourceList.add("第" + i + "条数据");
        }

        System.out.println("数据条数：" + sourceList.size());
        long a1=System.currentTimeMillis();
        for (int i = 0;i < sourceList.size();i++) dosomesth();
        long a2=System.currentTimeMillis();
        System.out.println("普通for循环用时：" + (a2-a1));
        long b1=System.currentTimeMillis();
        for (String t:sourceList) dosomesth();
        long b2=System.currentTimeMillis();
        System.out.println("增强for循环用时：" + (b2-b1));
        long c1=System.currentTimeMillis();
        sourceList.forEach((t)-> dosomesth());
        long c2=System.currentTimeMillis();
        System.out.println("forEach循环用时：" + (c2-c1));

      /*  long d1 = System.currentTimeMillis();
        sourceList.stream().forEach((t)->{ dosomesth(); });
        long d2 = System.currentTimeMillis();
        System.out.println("forEach-Stream循环用时：" + (d2-d1));*/

        long start = System.currentTimeMillis();
        sourceList.parallelStream().forEach((t)->{ dosomesth(); });
        long end = System.currentTimeMillis();
        System.out.println("forEach-Stream循环用时：" + (end-start));
    }

    public static void dosomesth() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
