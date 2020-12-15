package com.ytc.text.javase;

public class Test19 {
    public static void main(String[] args) {
   /*     for (int i = 1; i <= 9; i++) {
            System.out.print(" ");
            for (int j = 1; j < 1 + i; j++) {
                System.out.print("*");

            }
            i++;
            System.out.println("");


        }*/
      /*  //上五
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < 5 - i; j++) System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) System.out.print('*');
            System.out.println();
        }

        //下4
        for (int a = 1; a <= 4; a++) {
            for (int f = 1; f <= a; f++) System.out.print(" ");
            for (int h = 7; h >= 2 * a - 1; h--) System.out.print('*');
            System.out.println();
        }*/

        //上五
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) System.out.print(' ');
            for (int s = 1; s <= 2 * i - 1; s++) System.out.print('*');
            System.out.println();
        }

        //下4
        for (int x = 1; x <= 4; x++) {
            for (int u = 1; u <= x; u++) System.out.print(' ');
            for (int y = 7; y >= 2 * x - 1; y--) System.out.print('*');
            System.out.println();
        }
    }
}
