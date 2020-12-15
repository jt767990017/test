package com.ytc.text.november15;

public class TestThree {
    /**
     * 3.请计算1-1000的和。使用递归算法。
     */
    public static void main(String[] args) {
        System.out.println(recursion(1, 1000));
    }

    public static int recursion(int i, int sum) {

        sum += i;

        if (i < 1000) {
            i++;
            sum = recursion(i, sum);
        }
        return sum;

    }
}
