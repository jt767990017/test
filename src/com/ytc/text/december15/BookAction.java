package com.ytc.text.december15;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class BookAction {
    public static void addBook(Book Book) {
        File file = new File("BookInfo2.txt");
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
            fw.write(Book.toString());
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws ParseException {
        addBook(new Book(3211, "一座城池", 40, "小说", new SimpleDateFormat("yyyy-MM-dd").parse("2014-2-14")));
    }
}
