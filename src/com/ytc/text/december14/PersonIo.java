package com.ytc.text.december14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PersonIo {


    public static List<Person> readPerson() {
        List<Person> personList = new ArrayList<>();

        FileReader fr = null;
        try {
            fr = new FileReader("readPerson.txt");
            char[] chars = new char[1024];
            int len;
            while ((len = fr.read(chars)) != -1) {
                fr.read(chars, 0, len);
            }
            String[] split = String.valueOf(chars).split("\r\n");
            for (String s : split) personList.add(new Person(s.split(",")[0], s.split(",")[1]));


        } catch (IOException e) {
            e.printStackTrace();
        }

        return personList;
    }

    public static void main(String[] args) {
        List<Person> personList = readPerson();
        personList.forEach(System.out::println);
    }
}
