package com.ytc.text.javase;

public class MaoPao {
    public static void main(String[] args) {
//        int[] arr = {9,8,7,6,5,4,3,2,1};
//        braArr(arr);
//        for (int i : arr) {
//            System.out.print(i + " ");
//        }
        System.out.println("魔术开始");

        int left = 5;
        int right = 8;

        System.out.println("左手牌是方块："+left);
        System.out.println("右手牌是黑桃："+right);

        int y = left;
        left = right;
        right = y;

        System.out.println("改变后左手牌是方块："+	left);
        System.out.println("改变后右手牌是黑桃："+	right);
    }

    public static void braArr(int arr[] ) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
