package com.ytc.text.javase;

public class Test20 {
    public static void main(String[] args) {

        //上5
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) System.out.print(" ");
            //原本实心部分
            for (int s = 0; s <= 2 * i - 1; s++) {
                if (s == 1 || s == 2 * i - 1) System.out.print('*');
                System.out.print(' ');
            }
            System.out.println();
        }

        //下4
        for (int x = 4; x >= 1; x--) {
            for (int c = 1; c <= 5 - x; c++) System.out.print(" ");
            //原本实心部门
            for (int j = 1; j <= 2 * x - 1; j++) {
                if (j == 1 || j == 2 * x - 1) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }

    }
}
