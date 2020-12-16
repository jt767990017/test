package com.ytc.text.javaIO;

import com.ytc.text.december4.Goods;
import org.junit.Test;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class OutPutIO {
    public static void main(String[] args) {
        System.out.println("==========IO流===========");

        File file = new File("D:/java面向对象整体笔记.txt");
        for (String o : getIOText(file)) {
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
    public static List<String> getIOText(File file) {

        if (file.isFile() && file.exists()) { //判断文件路径表示是不是一个标准文件 并且  文件路径名的表示或文件名是否存在

            try {

                FileInputStream fileInputStream = new FileInputStream(file); //文件输入流
                InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream, "GBK"); //文件阅读器
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);  //读取文本并缓冲字符 已便有效的读取 字符数组和行

//                StringBuffer sb = new StringBuffer();
                List<String> list = new ArrayList<String>();
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


    @Test
    public void Test() throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("a.text");
        FileWriter fileWriter = new FileWriter(file);


        if (!file.exists()) {  //不存在
            boolean newFile = file.createNewFile(); //创建文件
        }
        //文件写入
        List<String> ioText = getIOText(new File("D:/java面向对象整体笔记.txt"));
        for (String ioFile : ioText) {
            fileWriter.write(ioFile + "\n");
        }
        fileWriter.close();
        long end = System.currentTimeMillis();

        System.out.println("start:" + (start / 1000));
        System.out.println("end:" + (end / 1000));
        System.out.println((long) (end - start));
    }


    @Test
    public void Test1() throws IOException {
        FileInputStream fis = new FileInputStream(new File("a.text"));
        InputStreamReader streamReader = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(streamReader);
        List<String> list = new ArrayList<>();
        String text = "";
        while ((text = br.readLine()) != null) {
            list.add(text);
        }
        for (String s : list) {
            System.out.println(s);
        }


    }


    @Test
    public void Test2() {
        List<Goods> goodsList = getMaxPriceGoods();

        goodsList.forEach(System.out::println);

        System.out.println("价格最高的商品名称：" + getMaxPriceGoods(goodsList));

    }


    // 1.编写程序返回集合中的商品类型为食品价格最高的商品名称
    public static String getMaxPriceGoods(List<Goods> list) {
        double maxGoodsPrice = list.get(0).getGoodsPrice();
        String str = "";
        for (Goods goods : list) {
            if (maxGoodsPrice < goods.getGoodsPrice()) {
                maxGoodsPrice = goods.getGoodsPrice();
                str = goods.getGoodsName();
            }
        }
        return str;
    }

    //控制台输出返回
    public static List<Goods> getMaxPriceGoods() {
        Date date = new Date(System.currentTimeMillis());
        Goods goods1 = new Goods();
        goods1.setGoodsId(1);
        goods1.setGoodsName("树1");
        goods1.setGoodsType("木材1");
        goods1.setGoodsPrice(10.36);
        goods1.setGoodsDate(date);
        Goods goods2 = new Goods();
        goods2.setGoodsId(2);
        goods2.setGoodsName("树2");
        goods2.setGoodsType("木材2");
        goods2.setGoodsPrice(30000);
        goods2.setGoodsDate(date);
        Goods goods3 = new Goods();
        goods3.setGoodsId(3);
        goods3.setGoodsName("树3");
        goods3.setGoodsType("木材3");
        goods3.setGoodsPrice(2001);
        goods3.setGoodsDate(date);
        List<Goods> arrayList = new ArrayList<>();
        arrayList.add(goods1);
        arrayList.add(goods2);
        arrayList.add(goods3);
        return arrayList;
    }

    //使用IO流读取文件，将文件中价格高于10的信息输出到控制台
    @Test
    public void Test3() {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("D:/loadRead.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
            String str = null;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void Test4() {
        //创建文件
        File file = new File("Book.txt");
        if (!file.exists()) { //判断文件是否存在
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileWriter fw = new FileWriter(file);
            for (Goods goods : getMaxPriceGoods()) {
                fw.write(goods.toStringAll() + "\n");
            }
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    //，将文件中年限大于3的信息输出到控制台。在main方法中调用getBookInfo()方法
    @Test
    public void Test5() throws IOException, ParseException {
        FileInputStream fis = new FileInputStream("D:/Book.txt");
        BufferedReader br = new BufferedReader(new InputStreamReader(fis, StandardCharsets.UTF_8));
        String str = "";
        while ((str = br.readLine()) != null) {
//            System.out.println(str);
            String[] s = str.split(" ");
            Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(s[4]);
            long year = ((new Date(System.currentTimeMillis()).getTime() - parse.getTime()) / 365 / 1000 / 60 / 60 / 24);
            if (year > 3) {
                System.out.println(Arrays.toString(s));
            }
        }
    }


    //已知d盘有文件Car.txt文件，文件中写的是汽车的信息
    @Test
    public void Test6() throws IOException {
        //读取文件
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("D:/Car.txt"), StandardCharsets.UTF_8));
        //创建文件
        File file = new File("copyCar.txt");

        //写入文件
        FileWriter fw = new FileWriter(file);
        if (!file.exists()) { //判断你文件是否存在
            file.createNewFile();
        }

        String str = "";
        while ((str = br.readLine()) != null) {
            //写入文件
            fw.write(str + "\n");
        }
        br.close();
        fw.close();
    }


    @Test
    public void Test61() {
        Integer[] str = {1, 2, 3, 4, 5, 9, 6, 7, 8, 1, 23, 489, 789, 4, 21, 1, 2, 354, 546, 789, 4,};
        new HashSet<>(Arrays.asList(str)).forEach(n -> System.out.print(n + " "));
        System.out.println();
        List<Integer> integers = Arrays.asList(str);

        integers.sort((start, end) -> -start.compareTo(end));
        integers.forEach(n -> System.out.print(n + " "));
    }


    @Test
    public void y() {
//        boolean b = 5 % 3 == 1 ? false : true;
//        String s = "abc";
//        Date date = new Date();
//        System.out.println(date);
//        int i = 1 / 2 * 9;
//        System.out.println(i);

        int a = 10;
        int b = 20;
        if (a++ > 10 || --b < 20) {
            a += 10;
            b += 20;
        }
        System.out.println(a + "," + b);

        int count = 10;
        while (true) {
            System.out.println("$");
            count--;
            if (count == 5) break;
        }

        for (int i = 1; i <= 10; i += 2) {
            System.out.println(i);
        }
    }
}
