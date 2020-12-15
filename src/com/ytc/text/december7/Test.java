package com.ytc.text.december7;

import com.ytc.text.December3.Order;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static List<Order> getOrderList() throws ParseException {
        SimpleDateFormat sm = new SimpleDateFormat("yyyy-MM-dd");
        Order order = new Order(1000, "海淀区", "1810490968", sm.parse("1965-7-1"));
        Order order1 = new Order(1001, "丰台区", "1810495841", sm.parse("1965-7-1"));
        Order order2 = new Order(1002, "清河区", "1810490854", sm.parse("1955-7-1"));
        Order order3 = new Order(1003, "成爱区", "1810461398", sm.parse("1945-7-1"));
        Order order4 = new Order(1004, "银州", "1810444468", sm.parse("1964-7-1"));
        List list1 = new ArrayList();
        list1.add(order);
        list1.add(order4);
        list1.add(order3);
        list1.add(order2);
        list1.add(order1);
        return list1;
    }

    public static void main(String[] args) throws ParseException {

        List list = getOrderList();

        for (Object object : list) {
            Order order = (Order) object;
            order.getOrderPhone();
            System.out.println(object);

        }

    }
}

