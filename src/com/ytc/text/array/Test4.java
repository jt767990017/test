package com.ytc.text.array;

public class Test4 {
    /**
     * 新建类TestFour,创建main()方法,
     * 定义数组boolean bol = {3>5,true,false,8==9,!false}；
     * 判断该数组当中true的个数以及false的个数并打印输出。
     */
    public static void main(String[] args) {
        boolean[] bol = {3 > 5, true, false, 8 == 9, !false};

        int trueCount = 0;
        int falseCount = 0;

        for (boolean b : bol) {
            if (true == b) {
                trueCount++;
            } else {
                falseCount++;
            }
        }
        System.out.println("true个数：" + trueCount + " " + "false个数：" + falseCount);
    }
}
