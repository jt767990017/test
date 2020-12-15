package com.ytc.text.november17;

public class Nb17 {

    //1.在main()方法中for循环控制台打印输出100以内的数,
    //如果数为66  88   99就略过不进行控制台打印输出
    public final void intTransferParameters(int num) {
        for (int i = 1; i <= num; i++) {
            if (i != 66 && i != 88 && i != 99) {
                System.out.print(i + " ");
            }
        }
    }


    //在main方法定义一个年龄数组。
    // int[] stucount= 	{2,4,7,11,34,15}，输出数组中偶数下标位置上 元素的乘积
    public int getArraycle(int[] stucount) {

        int sj = 1;
        for (int i : stucount) {
            if (i % 2 == 0) {
                sj *= i;
            }
        }
        return sj;
    }


    //定义一个二维数组int[][] d={{6,8,3,20},{5,12,34,17}}请输出数组中所有奇数的平均值
    public double getAvg(int[][] d) {

        double count = 0;
        double sum = 0;
        for (int i = 0; i < d.length; i++) {
            for (int j = 0; j < d[i].length; j++) {
                if (d[i][j] % 2 != 0) {
                    count++;
                    sum += d[i][j];
                }
            }
        }
        return sum / count;
    }

    //在main方法中定义一个count成绩变量，
    // 判断，如果成绩大80分，输出优秀。
    // 如果成绩大于70并且小于80分，输出良好。
    // 如果成绩大于60分并且小于70分，
    // 输出及格。小于60分，输出不及格了
    public String performanceJudgment(int count) {
        String str = "";
        if (count > 80) {
            str = "优秀";
        } else if (70 < count && count < 80) {
            str = "良好";
        } else if (60 < count && count < 70) {
            str = "及格";
        } else {
            str = "不及格";
        }
        return str;
    }


    //在main()方法实例化一个int类型的数组,并且给数组的元素赋值,(4分)
    //如果数组的长度小于等于3则在控制台打印输出”逢考必过”;(3分)
    //如果数组的长度大于3则在控制台打印输出”能过就过”.(3分)
    public String getStringArrays(int[] arr) {
        String str = "";
        if (3 < arr.length) {
            str = "能过就过";
        } else {
            str = "逢考必过";
        }
        return str;
    }


    //在main()方法实例化一个String类型的数组长度为6,并且给数组的元素赋值,
    //For循环数组,循环中if判断如果下标为偶数则在控制台打印输出该下标对应的数组元素;
    public String[] getOddNumber(String[] str) {
        String[] arr = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            if (i % 2 != 0) {
                arr[i] = str[i];

            }
        }
        return arr;
    }

    //在main()方法中for循环100以内的数,
    // 将2的倍数相加,如果当前的总和大于88,
    // 循环就终止并在控制台打印输出当前的总和

    public int get100Nei2BeiShu() {
        int sum = 0;
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        if (sum > 88) {
            return sum;
        }
        while (true) {
            ++sum;

        }
    }


    //在main方法中定义数组	int[] arr = {1,3,81,57,16,9,-24};
    // 输出数组中能被9整除的最小的数。

    public int getArrayMin(int[] arr1) {
        int min = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 9 == 0) {
                if (min > arr1[i]) {
                    min = arr1[i];
                } else {
                    min = arr1[i];
                }
            }
        }

        return min;
    }


    //中定义一个二维数组int[][] d={{6,8,3,20},{5,12,34,17}}
    //请输出数组中所有奇数的平均值
    public double get2AvgOddNumber(int[][] dd) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < dd.length; i++) {
            for (int j = 0; j < dd[i].length; j++) {
                if (dd[i][j] % 2 != 0) {
                    count++;
                    sum += dd[i][j];
                }
            }
        }
        return sum / count;
    }


    //在main()方法实例化一个long类型的数组,并且给数组的元素赋值,
    // 求数组中大于200的偶数的个数和奇数的个数
    public String getOddNumberjishu() {
        long[] arr = {201, 100, 30, 700, 800, 900, 122};
        int countOdd = 0;
        int countEven = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }
        return " " + countEven + " " + countOdd;
    }


    //在main()方法实例化一个int类型的数组长度为6,并且给数组的元素赋值,
    //循环数组,计算下标为奇数上 元素的和。并判断该和为奇数还是偶数，如果是
    //奇数则打印出“数组和为**，该和为奇数”。或者“数组和为**，该和为偶数”
    //注意：本题**为具体的值。
    public void getArrayOddEven(int[] arr2) {
        int sumOdd = 0;
        int sumEven = 0;

        for (int i = 0; i < arr2.length; i++) {
            if (i % 2 != 0) {
                sumOdd += arr2[i];
            } else {
                sumEven += arr2[i];
            }
        }
        System.out.println("数组和为 " + sumOdd + " 该和为奇数" + "," + " 数组和为 " + sumEven + " 该和为偶数");
    }


}
