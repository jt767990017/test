package com.ytc.text.array;

public class Test13 {
    /**
     * .新建Test13类,创建main()方法,定义数组
     * String[] arr = {"张三","李四","张三","王五","张三","赵六"},
     * 统计出数组中叫张三的个数
     */
    public static void main(String[] args) {
        String[] arr = {"张三", "李四", "张三", "王五", "张三", "赵六"};

        int count = 0;
        for (int i = 0; i < arr.length; i++) if ("张三".equals(arr[i])) count++;
        System.out.println("数组中叫张三的个数：" + count);
    }
}
