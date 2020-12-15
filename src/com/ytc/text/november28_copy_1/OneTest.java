package com.ytc.text.november28_copy_1;

import java.util.Scanner;

public class OneTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("输入第一个");
        int start = sc.nextInt();

        System.out.println("输入第二个");
        int end = sc.nextInt();
        StringBuffer stringBuffer = new StringBuffer();

        String str = "";
        int cc = 1;

        int count = 1;
        String str1 = "";

        for (int j = start; j <= end; j++) {
            str1 += count++;
            stringBuffer.append(str += cc).append("+");
        }

        System.out.print("(" + stringBuffer.substring(0, stringBuffer.length() - 1) + "=" + str1 + ")");

    }
}
