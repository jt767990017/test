package com.ytc.text.december7;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Bank {
    private int clientId; //     客户号      int类型
    private String clientName; //    姓名        String类型
    private String AccountNumber; //   账号        String类型
    private Date happenDate; //   交易时间     Date类型
    private double happenMoney; //  交易额       double类型

    @Override
    public String toString() {
        return "Bank{" +
                "clientId=" + clientId +
                ", clientName='" + clientName + '\'' +
                ", AccountNumber='" + AccountNumber + '\'' +
                ", happenDate=" + happenDate.toLocaleString() +
                ", happenMoney='" + happenMoney + '\'' +
                '}';
    }

    public Bank() {
    }

    public String getClientName() {
        return clientName;
    }

    public String getAccountNumber() {
        return AccountNumber;
    }

    public Date getHappenDate() {
        return happenDate;
    }

    public double getHappenMoney() {
        return happenMoney;
    }

    public Bank(int clientId, String clientName, String accountNumber, Date happenDate, double happenMoney) {
        this.clientId = clientId;
        this.clientName = clientName;
        AccountNumber = accountNumber;
        this.happenDate = happenDate;
        this.happenMoney = happenMoney;
    }

    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }
}

class A {

    public static void main(String[] args) throws ParseException {
        String str = "10001,刘德华,4155990188888888,2011-10-10,300.00;"
                + "10002, 晓龙, 4155990199999999, 2014-1-5, 500.00;"
                + "10003, 黄晓明, 4155990100000000, 2011-9-17, 1000.50;"
                + "10004, 张东健, 4155990155555555, 2015-11-28, 600.99;"
                + "10005, 梁朝伟, 4155990111111111, 2013-10-11, 5000.00;"
                + "10006, 王宝强, 4155990188888888, 2013-8-10, 200.00;";
        List list = new ArrayList();
        Map map = new HashMap();
        for (String s : str.split(";")) {
            String[] split1 = s.split(",");
            list.add(new Bank(Integer.parseInt(split1[0]), split1[1], split1[2], new SimpleDateFormat("yyyy-MM-dd").parse(split1[3]), Double.parseDouble(split1[4])));
        }

        list.add(123456);
        for (Object o : list)
            System.out.println(o);
        System.out.println("*******************统计集合中的所有的对象中的happenMoney  的总和并返回***********************");
        double sum = 0;
        for (Object o : list) {
            if (o instanceof Bank) {
                sum += ((Bank) o).getHappenMoney();
                System.out.println(o);
            }
        }
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println("迭代器遍历："+next);
        }

        System.out.println(sum);
    }
}