package com.ytc.text.december16;

import java.util.Date;

import org.junit.Test;


import java.io.*;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class TestClass {

    //  封装此类，重写equals和hashCode方法，重写toString方法 并在方法中返回
    @Test
    public void test() throws ParseException {

        try {
            System.out.println(new Beverage(10001, "可口可乐",
                    "碳酸饮料", new SimpleDateFormat("yyyy-MM-dd")
                    .parse("2016-9-6"), 100));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }


    //使用字符缓冲流读取 文件中的内容 并分割字符串 放到Beverage对象中，并将Beverage对象 放到 List<Beverage>  beverageList集合中
    public List<Beverage> getListBeverageFindAll() {

        BufferedReader br = null;
        List<Beverage> list = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader("Beverage.txt"));
            String text = "";
            while ((text = br.readLine()) != null) {
                String[] split1 = text.split(",");
                list.add(new Beverage(Integer.parseInt(split1[0]), split1[1],
                        split1[2], new SimpleDateFormat("yyyy-MM-dd")
                        .parse(split1[3]), Integer.parseInt(split1[4])));
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return list;
    }

    @Test
    public void test1() {
        List<Beverage> listBeverageFindAll = getListBeverageFindAll();
        long a = listBeverageFindAll.get(0).getBeverageDate().getTime();

        //获取最小毫秒值
        for (Beverage beverage : listBeverageFindAll) {
            if (a > beverage.getBeverageDate().getTime()) {
                a = beverage.getBeverageDate().getTime();
            }
        }

        for (Beverage beverage : listBeverageFindAll) {
            if (beverage.getBeverageDate().getTime() == a) System.out.println(beverage.toString());
        }

    }


    /**
     * 一个静态方法getRandomBeverage，参数为一个list集合，方法的功能从参数list集合中随机取出一个Beverage对象，
     * 并返回在主函数中 实例化 Beverage类的的3个对象  分别赋任意值 并将三个 对象 放入 一个
     * List<Beverage> beverageList  集合中
     * 在主函数中调用 getRandomBeverage方法 参数是 beverageList 接收返回值并输出
     */
    public List<Beverage> getRandomBeverage() throws ParseException {
        List<Beverage> list = new ArrayList<>();
        list.add(new Beverage(1, "21", "21", new SimpleDateFormat("yyyy-MM-dd").parse("2020-1-1"), 110));
        list.add(new Beverage(11, "22", "22", new SimpleDateFormat("yyyy-MM-dd").parse("2020-1-2"), 1101));
        list.add(new Beverage(111, "23", "23", new SimpleDateFormat("yyyy-MM-dd").parse("2020-1-3"), 1101));
        return list;
    }

    @Test
    public void TestBeverage() throws ParseException {
        List<Beverage> randomBeverage = getRandomBeverage();
        randomBeverage.forEach(System.out::println);
        writeBeverage(randomBeverage);
    }


    /**
     * 4.在TestBeverage类中，主函数外创建静态的writeBeverage方法，参数为beverageList
     * 集合，该方法的作用为将beverageList  集合中的Beverage对象的信息 写出到 ru.txt文件中
     */
    public void writeBeverage(List<Beverage> beverageList) {
        File file = new File("ru.text");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String str = "";
        for (Beverage beverage : beverageList) {
            str += beverage.toString() + "\n";
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(str + "\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    /**
     * 创建TestOne类并定义方法打印九九乘法表
     */

    @Test
    public void t99() {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "*" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
    }


    /**
     * 2.创建TestTwo类并定义方法采用Scanner接收用户输入的5门功课成绩并且计算平均分。
     * 给用户功课成绩评等级如果60-80控制台输出良，如果81-90控制台输出好，如果91-100控制台输出优秀。
     */
    @Test
    public void test5() {
//        Scanner sc = new Scanner(System.in);
        System.out.println("请输入数字");
//        int i = sc.nextInt();
        int i = 50;
        if (60 >= i && i <= 80) {
            System.out.println("良");
        } else if (81 >= i && i <= 90) {
            System.out.println("好");
        } else if (91 >= i && i <= 100) {
            System.out.println("优秀");
        } else {
            System.exit(0);
        }


    }


    /**
     * 在PhoneService类中创建public String getPhoneByTypeAndPrice(List<Phone> list)方法，
     * 编写程序返回集合中的手机类型为商务机价格高于4000的手机名称和手机生产日期
     */
    public String getPhoneByTypeAndPrice(List<Phone> list) throws ParseException {
        String str = "";
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPhonePrice() >= 4000) {
                str += list.get(i).getPhoneName() + "," + list.get(i).getPhoneDate().toLocaleString().split(" ")[0] + "\n";
            }
        }


        return str;
    }

    /**
     * 6.定义main方法，在main方法中任意实例化5个phone对象，将对象存储到List中，作为参数调用getphoneByTypeAndPrice方法，在控制台输出返回结果。
     */
    @Test
    public void test7() throws ParseException {
        List<Phone> list = new ArrayList<>();
        list.add(new Phone(1, "苹果", "平板", 5000, new SimpleDateFormat("yyyy-MM-dd").parse("2020-9-2")));
        list.add(new Phone(2, "华为", "平板", 4000, new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4")));
        list.add(new Phone(3, "小米", "平板", 2001, new SimpleDateFormat("yyyy-MM-dd").parse("2020-11-5")));
        list.add(new Phone(4, "一家", "平板", 2300, new SimpleDateFormat("yyyy-MM-dd").parse("2020-12-7")));
        list.forEach(System.out::println);
        String phoneByTypeAndPrice = getPhoneByTypeAndPrice(list);
        System.out.println(phoneByTypeAndPrice);
    }

    //式写入D盘phoneInfo2.txt
    public void addPhone(Phone phone) {
        File file = new File("phoneInfo21.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileWriter fw = null;
        try {
            fw = new FileWriter(file);
            fw.write(phone.toString()+"\n");
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void PhoneAction() {
        addPhone(new Phone(2, "样子", "平板", 60000, new Date()));
        Phone phone = new Phone();
        phone.setPhoneId(0);
        phone.setPhoneName("小子");
        phone.setPhoneType("人");
        phone.setPhonePrice(10000000);
        phone.setPhoneDate(new Date());
        addPhone(phone);


    }
}

