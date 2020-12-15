package com.ytc.text.december15;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

public class TestObj {

    //1.编写程序在控制台输出成年男生的姓名。
    @Test
    public void test() {
        String[][] arr = {{"张小三", "25", "男"}, {"王小六", "22", "女"}, {"李大嘴", "17", "男"}, {"小红", "13", "女"}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j].contains("男")) {
                    System.out.println(Arrays.toString(arr[i]));
                }
            }
        }
        System.out.println("*******2.定义文件名字符串“hello.zip；test.java；abc.jpg；pop001.gif”。编写程序根据后缀名输出Java文件文件名。*********");
        String str = "hello.zip；test.java；abc.jpg；pop001.gif";
        for (String s : str.split("；"))
            if (s.contains("java"))
                System.out.println(s);
    }

    //BookInfo.tx

    @Test
    public void test1() {
        FileReader fr = null;
        try {
            fr = new FileReader("BookInfo.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fr.read(chars, 0, len);
            }
            fr.close();
            for (String s : String.valueOf(chars).split("；"))
                if (s.contains("图书类型") && s.contains("小说"))
                    System.out.println(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void t() {
     /*   int a = 10;
        while (a >= 0) {
            System.out.print(a + "，");
            --a;
            --a;
        }
*/
        String s = "因特驰教育，万薪就业！";
        System.out.println(s.substring(3, 5));


        int a = 10;
        int b = 20;

        int c = a++>10&&--b<20?a:b;

        System.out.println(c);
        System.out.println(b);

        int count = 10;
        while(true){
            System.out.println("$");
            count -= 2;
            if (count==0)break;
        }

        System.out.println(new Random().nextInt(8)+3);
        System.out.println("______________________________");
        int value = getValue(2);
        System.out.println(value);

    }


    public static int getValue(int i) {
        int result = 0;
        switch (i) {
            case 1:
                result = result + i;
            case 2:
                result = result + i * 2;
            case 3:
                result = result + i * 3;
        }
        return result;
    }
}

class A{
    String str = new String("good");
    char[] ch = { 'a', 'b', 'c' };

    public void change(String str, char ch[]) {
        str = "test ok";
        ch[0] = 'g';
    }

    public static void main(String args[]) {

        A ex = new A();
        ex.change(ex.str, ex.ch);
        System.out.print(ex.str + " and ");
        System.out.print(ex.ch);

    }
}
