package com.ytc.text.november13;

public class TestEthi {
    /**
     * 新建TestFive类,创建main()方法，完成以下要求(本题共10分)
     * 在main方法中循环1-50，输出能被10整除的第2个数
     */
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i < 51; i++) {
            if (i % 10 == 0) {
                count++;
                if (count == 2) {
                    System.out.println("能被10整除的第2个数：" + i);
                }
            }

        }
    }
}
