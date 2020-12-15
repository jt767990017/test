package com.ytc.text.november15;

import java.util.Scanner;

public class Test1 {
    /**
     * 有一个登录系统，输入用户名和密码，用户名值为学生姓名小写，
     * 密码统一为：123 ，判断：控制台输入的用户名和密码
     * 是否和定义的学生姓名小写密码123相同，
     * 如果相同控制台打印：登陆成功
     * 如果不相同则打印：用户名或密码错误
     */

    //实例化静态资源
    private static String username = "root";
    private static String password = "123";
    private static Scanner scanner = new Scanner(System.in);

    /*public static void main(String[] args) {

        System.out.println("请输入用户名：");
        String next = scanner.next();

        System.out.println("请输入密码：");
        String pass = scanner.next();

        if (next.equals(username) && pass.equals(password)) {
            success();
        }else {
            failure();
        }


    }
*/

    private static void failure() {
        System.out.println("用户名或密码错误");
    }

    private static void success() {
        System.out.println("登陆成功");
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.println("输入 " + i + " 个数");
            sum += scanner.nextInt();
        }

        if (sum >= 100) {
            System.out.println("太多了！");
        } else {
            System.out.println("距离100还差 " + (100 - sum));
        }
    }
}
