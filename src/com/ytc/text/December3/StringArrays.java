package com.ytc.text.December3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class StringArrays {
    public static void main(String[] args) throws ParseException {
        String[] arr = {"好好学习", "不打架", "不违纪", "少抽烟", "不旷课"};
        StringBuffer sb = new StringBuffer();
        for (String s : arr) if (s.indexOf("不") == 0) sb.append(s).append(",");
        System.out.println(sb.substring(0, sb.length() - 1));

        String[] ar = new String[arr.length];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf("不") == 0) {
                ar[j] = arr[i];
                j++;
            }
        }

        String[] strings = new String[j];
        System.arraycopy(ar, 0, strings, 0, j);

        System.out.println(Arrays.toString(strings));


        System.out.println("*********************************日期格式化*********************************");

        //使用c
        String format = String.format("全部日期和时间信息：%tc%n", new Date());
        System.out.println(format);

        //使用F
        String format1 = String.format("年-月-日格式：%tF%n", new Date());
        System.out.println(format1);

        //使用d
        String format2 = String.format("月/日/年格式：%tD%n", new Date());
        System.out.println(format2);

        //使用r
        String format3 = String.format("HH:MM:SS PM格式（12时制）：%tR%n", new Date());
        System.out.println(format3);

        //使用t
        String format4 = String.format("HH:MM:SS格式（24时制）：%tT%n", new Date());
        System.out.println(format4);


        //使用R
        String format5 = String.format("HH:MM格式（24时制）：%tR%n", new Date());
        System.out.println(format5);
    }
}
