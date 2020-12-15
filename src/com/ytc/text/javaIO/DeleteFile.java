package com.ytc.text.javaIO;

import org.junit.Test;

import java.io.File;

public class DeleteFile {

    @Test
    public void test() {

        File file = new File("C:/Users/Administrator/Desktop/a");

        if (!file.exists()) { //判断是目录并且存在
            boolean delete = file.delete();
            System.out.println(delete);
        }

    }
}
