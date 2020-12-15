package com.ytc.text.december15;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.List;

public class BookService {

    public static String getBookByTypeAndPrice(List<Book> list) {
        Integer mac = 20;
        String str = "";
        for (Book book : list) {
            if (book.getBookAge() > mac && "小说".equals(book.getBookType())) {
                mac = book.getBookAge();
                str = book.getBookName();
            }
        }
        return str;
    }

    public static void main(String[] args) throws ParseException {
        Book[] arr = new Book[]{
                new Book(1, "鲁迅S", 10, "教育S", new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4")),
                new Book(2, "鲁迅A", 101, "教育A", new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4")),
                new Book(3, "鲁迅B", 102, "教育B", new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4")),
                new Book(4, "鲁迅C", 103, "小说", new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4")),
                new Book(5, "鲁迅D", 104, "小说", new SimpleDateFormat("yyyy-MM-dd").parse("2020-10-4"))
        };
        System.out.println(getBookByTypeAndPrice(Arrays.asList(arr)));
    }
}
