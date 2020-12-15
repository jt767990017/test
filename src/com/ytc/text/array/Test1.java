package com.ytc.text.array;

public class Test1 {
    /**
     * 新建TestOne类,在类中创建main方法,在main方法中定义一个一维数组,int[] array= {14,32,6,7,54,96},输出数组中能被3或者能被5整除的数
     */
    public static void main(String[] args) {
        int[] array = {14, 32, 6, 7, 54, 96};
        for (int i : array) {
            if (i % 3 == 0 || i % 5 == 0) {
                System.out.println("被3或者能被5整除的数：" + i);
            }
        }
    }
}
