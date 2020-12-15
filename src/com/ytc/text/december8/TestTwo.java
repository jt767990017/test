package com.ytc.text.december8;


import com.ytc.text.console.ConsoleUtils;

import javax.xml.soap.Node;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class TestTwo {
    public static void main(String[] args) throws ParseException {
        String str = "welcome  to  yin  te  chi";
        for (String s : str.split("  "))
            ConsoleUtils.getConsolePrint(s.substring(0, 1).toUpperCase() + s.substring(1) + " ");
        System.out.println();
        ConsoleUtils.getConsolePrintln("*****************复联4：2019/5/20;复联3：2018-05-01”*********************");

        String fl = "复联4：2019/5/20;复联3：2018-05-01";
        int count = 0;
        double start = 0;
        double end = 0;
        for (String s : fl.split(";")) {
            String[] split = s.split("：");
            if (count == 0) start = new SimpleDateFormat("yyyy/MM/dd").parse(split[1]).getTime();
            count++;
            if (count == 2) end = new SimpleDateFormat("yyyy-MM-dd").parse(split[1]).getTime();
        }
        ConsoleUtils.getConsolePrintln("时隔得天数：" + ((start - end) / (1000 * 60 * 60 * 24)));

        System.out.println("*****************“hello.zip；test.java；abc.jpg；pop001.gif*********************");

        String s2 = "hello.zip；test.java；abc.jpg；pop001.gif";
        for (String s : s2.split("；")) if (s.contains("e")) ConsoleUtils.getConsolePrintln(s);
        List l = new ArrayList();
        HashMap map = new HashMap();

        map.put("a", null);
        map.put("b", 1);

        for (Object key : map.keySet()) {
            System.out.println(key + "：" + map.get(key));
        }
    }
}
