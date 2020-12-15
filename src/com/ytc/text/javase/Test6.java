package com.ytc.text.javase;

import java.util.Scanner;

public class Test6 {
    /**
     * 从键盘上输入一个值,如果是1,
     * 那么输出：今天星期一上街买大衣,大衣的价钱是一块一毛一。
     * 如果是2就输出：今天星期二上街买手绢,手绢的价钱是二块二毛二。
     * 如果是3就输出：今天星期三,上街买人参,人参的价钱是三块三毛三。
     * 如果是4就输出：今天星期四上街买柿子,柿子的价格是四块四毛四。
     * 如果是5就输出：今天星期五上街买老虎,老虎的价钱是五块五毛五
     * 如果是其他就是输出今天休息了,啥也不想买了
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("从键盘上输入一个值,如果是");
        int num = new Scanner(System.in).nextInt();
        if (num > 5) {
            System.out.println("今天休息了,啥也不想买了");
        }
        switch (num){
            case 1:
                System.out.println("今天星期一上街买大衣,大衣的价钱是一块一毛一");
                break;
            case 2:
                System.out.println("今天星期二上街买手绢,手绢的价钱是二块二毛二");
                break;
                case 3:
                System.out.println("今天星期三,上街买人参,人参的价钱是三块三毛三");
                break;
            case 4:
                System.out.println("今天星期四上街买柿子,柿子的价格是四块四毛四");
                break;
            case 5:
                System.out.println("今天星期五上街买老虎,老虎的价钱是五块五毛五");
                break;
        }
    }
}
