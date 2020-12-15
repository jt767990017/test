package com.ytc.text.november27_copy;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Test {
    public static void main(String[] args) {
/*        Person pw = new Warrior();
        Person pe = new Enchanter();
        pe.OutputSkills();
        pw.OutputSkills();*/

/*
        int it = 65;
        float fl = 65.0f;
        System.out.println("65和65 .0f 是否相等？" + (it == fl)); //true
        char ch1 = 'A';
        char ch2 = 12;
        System.out.println("65和'A'是否相等？" + (it == ch1)); // true
        System.out.println("12和ch2是否相等？" + (12 == ch2)); //true
        String str1 = new String("hello");
        String str2 = new String("hello");
        System.out.println("str1和str2是否相等？" + (str1 == str2)); //false

        System.out.println("str1是否equals str2？" + (str1.equals(str2))); //true
        System.out.println("hello" == str2); // false*/


        System.out.println("==========IO流===========");

        File file = new File("D:/java面向对象整体笔记.txt");
        for (Object o : getIOText(file)) {
            System.out.println(o);
        }
    }

    /**
     * 传入文件路径
     * 读取文件
     *
     * @param file
     * @return 返回读取内容
     */
    public static List getIOText(File file) {

        if (file.isFile() && file.exists()) { //判断文件路径表示是不是一个标准文件 并且  文件路径名的表示或文件名是否存在

            try {

                FileInputStream fileInputStream = new FileInputStream(file); //文件输入流
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream,"GBK"); //文件阅读器
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  //读取文本并缓冲字符 已便有效的读取 字符数组和行

//                StringBuffer sb = new StringBuffer();
                List list = new ArrayList();
                String text = "";
                System.out.println();
                while ((text = bufferedReader.readLine()) != null) {
//                    sb.append(text);
                    list.add(text);
                }
                fileInputStream.close();
                inputStreamReader.close();
                bufferedReader.close();
                return list;
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
