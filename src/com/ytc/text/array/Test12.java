package com.ytc.text.array;

import java.util.Scanner;

public class Test12 {
	/**
	 * Scanner输入两个个数,并进行加减乘除的运算,将计算出来的四个结果放入 int类型的数组中,求数组中偶数的个数
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] ints = new int[4];

		System.out.println("输入1个数");
		double v = sc.nextDouble();
		System.out.println("输入2个数");
		double aa = sc.nextDouble();

		double jia = v + aa;
		double jian = v - aa;
		double cheng = v * aa;
		double chu = v / aa;

		for (int i = 0; i < ints.length; i++) {
			ints[0] = (int) jia;
			ints[1] = (int) jian;
			ints[2] = (int) cheng;
			ints[3] = (int) chu;
		}

		int count = 0;
		for (int anInt : ints) {
			if (anInt % 2 == 0)
				count++;
		}
		System.out.println("偶数的个数：" + count);
	}
}
