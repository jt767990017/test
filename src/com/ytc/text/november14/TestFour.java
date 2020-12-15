package com.ytc.text.november14;

public class TestFour {
    /**
     * 定义数组
     * String[] arr = {"张三","李四","张三","王五","张三","赵六"}，统计出数组中叫张三的个数
     */
    public static void main(String[] args) {
        String[] arr = {"张三", "李四", "张三", "王五", "张三", "赵六"};
        System.out.println("数组中叫张三的个数：" + new AllMethodTest().getArrayName(arr));
    }


}
