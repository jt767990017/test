package com.ytc.text.november18;

public class Submethod extends ParentMethod {

    //2.在main方法有一维维数组 int[] array = {14,34,56,90,31,33,85}.
    // 求数组中能被3整除最大数和能被5整除最小数的和
    public void getInstance() {
        int[] array = {14, 34, 56, 90, 31, 33, 85};
        int max = 0;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 3 == 0) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            if (array[i] % 5 == 0) {
                if (min < array[i]) {
                    min = array[i];
                }else {
                    min = array[i];
                }
            }

        }
        System.out.println("中能被3整除最大数和能被5整除最小数的和：" + (max + min));
    }


    public void getMethod() {
       super.getParent();
       super.getObject();
    }
}
