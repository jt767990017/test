package com.ytc.text.november30;

import java.util.Arrays;

public class Book {

    private int id;         //id
    private String bookName; //书籍名称
    private int bookAge;     // 书籍年限

    private String bookType;// 书籍种类
    private String bookString;//出版日期

    public Book(int id, String bookName, int bookAge, String bookType, String bookString) {
        this.id = id;
        this.bookName = bookName;
        this.bookAge = bookAge;
        this.bookType = bookType;
        this.bookString = bookString;
    }

    public int getId() {
        return id;
    }

    public String getBookName() {
        return bookName;
    }

    public int getBookAge() {
        return bookAge;
    }

    public String getBookType() {
        return bookType;
    }

    public String getBookString() {
        return bookString;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                ", bookAge=" + bookAge +
                ", bookType='" + bookType + '\'' +
                ", bookString='" + bookString + '\'' +
                '}';
    }
}

class BookDemo {
    public static void main(String[] args) {
        Book[] arr = new Book[]{
                new Book(1, "鲁迅S", 10, "教育S", "2020-10-1"),
                new Book(2, "鲁迅A", 101, "教育A", "2020-10-2"),
                new Book(3, "鲁迅B", 102, "教育B", "2020-10-3"),
                new Book(4, "鲁迅C", 103, "文学", "2020-10-4"),
                new Book(5, "鲁迅D", 104, "文学", "2020-10-5"),
        };
        Book[] bookList = getBookList(arr);
        for (Book book : bookList) {
            System.out.println(book);
        }

    }

    public static Book[] getBookList(Book[] arr) {


        int j=0;
        Book[] arr1 = new Book[2];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getBookAge() > 3 && "文学".equals(arr[i].getBookType())) {
                arr1[j] = arr[i];
                j++;
            }
        }
        return arr1;
    }

}