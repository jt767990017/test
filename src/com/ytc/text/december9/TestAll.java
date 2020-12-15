package com.ytc.text.december9;

import org.junit.Test;

import java.util.*;

public class TestAll extends Thread {
//error: the requested upstream branch 'origin/master' does not exist
    @Test
    public void Test1() {
        //随机生成10个整数保存到List中，并按倒序、从大 到小的顺序显示出来
        List<Integer> arrayList = new ArrayList<>();
        Random runtime = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(runtime.nextInt(1000));
        }

        arrayList.sort((start,end)->-start.compareTo(end));

        arrayList.forEach(n -> {
            System.out.print(n + " ");
        });

    }

    /*
           请把学生名与考试分数录入到集合中，并按分数显示前三名 成绩学员的名字
           3.使用Map接口的实现类完成员工工资(姓名--工资)的摸拟：
           1)添加几条信息
           2)列出所有的员工姓名
           3)列出所有员工姓名及其工资
           4)删除名叫“Tom”的员工信息
           5)输出Jack的工资，并将其工资加1000元(通过取值实现)
           6)将所有工资低于1000元的员工的工资上涨20%(通过取值实现)
            */
    @Test
    public void Test2() {

        Map<String, Double> map = new HashMap<>();
        map.put("Tom", 1100.3);
        map.put("cat", 1500.3);
        map.put("a", 1205.3);
        map.put("b", 1305.3);
        map.put("c", 1405.3);

        map.forEach((k, v) -> {
            System.out.println("姓名：" + k + "，工资：" + v);
        });
        System.out.println("*******************删除名叫“Tom”的员工信息***********************");
        map.remove("Tom");
        map.forEach((k, v) -> {
            System.out.println("姓名：" + k + "，工资：" + v);
        });
        System.out.println("*******************5)输出Jack的工资，并将其工资加1000元(通过取值实现)***********************");

        map.put("Jack", 800.2);
        map.forEach((k, v) -> {
            if ("Jack".equals(k)) System.out.println("姓名：" + k + "，工资：" + (v + WageTable.WAGE));
        });

        System.out.println("*******************将所有工资低于1000元的员工的工资上涨20%(通过取值实现)***********************");
        map.forEach((k, v) -> {
            if (v > WageTable.WAGE) System.out.println("姓名：" + k + "，工资：" + (v + (v * WageTable.WAGE_SZ)));
        });
    }

    /**
     * 使用HashMap类实例化一个Map类型的对象m1，键（String类型）和
     * 值（int型）分别用于存储员工的姓名和工资，存入数据如下：
     * 张三——800元；李四——1500元；王五——3000元；
     * 1）将张三的工资更改为2600元
     * 2）为所有员工工资加薪100元；
     * 3）遍历集合中所有的员工
     * 4）遍历集合中所有的工资
     */
    @Test
    public void Test3() {
        Map<String, Integer> map = new HashMap<>();
        map.put("张三", 800);
        map.put("李四", 1500);
        map.put("王五", 3000);
        map.forEach((k, v) -> {
            if ("张三".equals(k)) {
                map.put(k, 2600);
            }
        });
        map.forEach((k, v) -> {
            System.out.println(k + "  ：" + v);
        });
        System.out.println("*******************为所有员工工资加薪100元************************");

        map.forEach((k, v) -> {
            System.out.println(k + "  ：" + (v + 100));
        });

        System.out.println("*******************为所有员工工资加薪100元************************");
        Iterator<String> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            String next = iterator.next();

            System.out.println("姓名：" + next);
            Integer integer = map.get(next);
            System.out.println("工资：" + integer);
        }
    }

    /**
     * 请编程实现：用户输入阿拉伯数字，将其转换成汉语中的大写，例如：15234 输出：壹万伍仟贰佰参拾肆。
     * 以下为可能用到的知识： '零' , '壹' , '贰' , '叁' , '肆' , '伍' , '陆' , '柒' , '捌' , '玖' 元' , '拾' ,
     * '佰' , '仟' , '万' , '拾' , '佰' , '仟' , '亿'
     */
    @Test
    public void Test4() {
        String str = "10";
        Character[] arr = {'佰', '仟', '万', '拾', '佰', '仟', '亿'};
        Character[] arr1 = {'零', '壹', '贰', '叁', '肆', '伍', '陆', '柒', '捌', '玖', '元', '拾'};
        String convert = convert(str);
        System.out.println(convert);
    }


    public String convert(String num) {
        String[] arr = {"", "拾", "佰", "仟", "万", "拾", "佰", "仟", "万", "拾", "佰", "仟"};

        //每个数字后插入个单位
        StringBuilder sb = new StringBuilder();
        int pos = 0;
        for (int i = num.length() - 1; i >= 0; i--) {
            char charAt = num.charAt(i);
            sb.insert(0, arr[pos]);
            sb.insert(0, charAt);
            pos++;
        }

        String retStr = sb.toString();
        retStr = retStr.replaceAll("0[仟佰拾]", "0"); //0仟0佰0拾，替换为0
        retStr = retStr.replaceAll("0([万亿])", "$1"); //0万0亿，替换为万/亿
        retStr = retStr.replaceAll("0+", "零");  //一个或多个0，替换为零
        retStr = retStr.replaceAll("零+$", ""); //去掉末尾的0
        retStr = retStr.replaceAll("1", "壹") //大写数字
                .replaceAll("2", "贰")
                .replaceAll("3", "叁")
                .replaceAll("4", "肆")
                .replaceAll("5", "伍")
                .replaceAll("6", "陆")
                .replaceAll("7", "柒")
                .replaceAll("8", "捌")
                .replaceAll("9", "玖");
        retStr += "元整";

        return retStr;
    }
}