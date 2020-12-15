package com.ytc.text.december12;

import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class OutTest {

    //红楼梦随便选取一段儿文字，统计每个字出现的次数，并把结果输出到一个文本文件中.
    @Test
    public void Test() throws IOException {
        List<Student> list = new ArrayList<>();
        list.add(new Student("妹", 100));
        list.add(new Student("贾", 50));
        list.add(new Student("宝", 50));
        list.add(new Student("玉", 50));
        File file = new File("student.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file);
        for (Student student : list) {
            fw.write(student.toString() + "\n");
        }
        fw.close();
    }


    //找一部自己喜欢的电影，大小不得小于1G，从D盘，复制到F盘，要求使用 FileInputStream和BufferedInputStream两种方式写，并比较他们的速度。
    @Test
    public void Test1() {

        // FileInputStream

        long start = System.currentTimeMillis();
        File file = new File("C:\\Users\\Administrator\\Desktop\\1.wmv");
        File fmp4 = new File("D:/copy.wmv");
        if (!file.exists()) {
            System.out.println("创建存在");
        }
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            if (!fmp4.exists()) {
                fmp4.createNewFile();
            }
            fis = new FileInputStream(file);
            fos = new FileOutputStream(fmp4);
            byte[] bytes = new byte[1024 * 5];
            int len = 0;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }

            fos.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.currentTimeMillis();

        System.out.println("*************************************************");

        //BufferedInputStream
        long startBos = System.currentTimeMillis();

        BufferedOutputStream bos = null;
        InputStreamReader br = null;
        try {
            br = new InputStreamReader(new BufferedInputStream(new FileInputStream(file)), StandardCharsets.ISO_8859_1);
            bos = new BufferedOutputStream(new FileOutputStream("D:/copyBos.wmv"));

            int len;
            while ((len = br.read()) != -1) {
                bos.write(len);
            }
            bos.close();
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long endBos = System.currentTimeMillis();

        System.out.println((end - start) > (endBos - startBos));

    }

    //在D盘定义ProductInfo.txt文件，文本内容为
    @Test
    public void Test2() {
        File file = new File("ProductInfo.txt");
        if (!file.exists()) {
            System.out.println("文件不存在");
        }
        InputStreamReader fr = null;
        try {
            fr = new InputStreamReader(new BufferedInputStream(new FileInputStream("ProductInfo.txt")));
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                len = fr.read(chars, 0, len);
            }
            fr.close();

            //char[] 转换 字符串数组
            String[] split1 = String.valueOf(chars).split("；");

            //字符串截取  遍历
            for (int i = 0; i < split1.length; i++) {
                String[] split = split1[i].split("，");
                for (int j = 0; j < split.length; j++) {
                    String[] split2 = split[j].split("：");
                    if (split2[0].contains("产品价格")) {
                        if (Integer.parseInt(split2[split2.length - 1]) > 10) {
                            System.out.println(split[2]);
                        }
                    }
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void ProductAction() {
        String str = "产品ID：211，产品名称：nike，产品价格：980，生产日期：2017-8-22";
        File file = new File("ProductInfo1.txt");
        FileWriter fw = null;
        try {
            if (!file.exists()) file.createNewFile();
            fw = new FileWriter(file);
            fw.write(str);
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //动物名称：八公，种类：狗，主人：唐三藏，生日：2017-11-11
    @Test
    public void dog() {
        FileReader fis = null;
        try {
            fis = new FileReader("dog.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fis.read(chars)) != -1) {
                fis.read(chars, 0, len);
            }
            fis.close();
            System.out.println(String.valueOf(chars));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

