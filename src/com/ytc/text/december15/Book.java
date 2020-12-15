package com.ytc.text.december15;

import java.util.Date;

public class Book {

    private Integer id;         //id
    private String bookName; //书籍名称
    private Integer BookPrice;     // 价格

    private String bookType;// 书籍种类
    private Date bookString;//出版日期

    public Book(Integer id, String bookName, Integer BookPrice, String bookType, Date bookString) {
        this.id = id;
        this.bookName = bookName;
        this.BookPrice = BookPrice;
        this.bookType = bookType;
        this.bookString = bookString;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public Integer getBookAge() {
        return BookPrice;
    }

    public String getBookType() {
        return bookType;
    }

    public Date getBookString() {
        return bookString;
    }

    @Override
    public String toString() {
        return
                "图书ID：" + id +
                        ", 图书名称：" + bookName + '\'' +
                        ", 图书价格：" + BookPrice +
                        ", 类型：'" + bookType + '\'' +
                        ", 生产日期：'" + bookString.toLocaleString().split(" ")[0] + '\''
                ;
    }
}

