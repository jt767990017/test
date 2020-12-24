package com.mysql.jdbcmysql.uilts;

import org.junit.Test;

import java.sql.*;

public class JDBCUilts {

    //查出
    @Test
    public void Selete() {
        Connection cn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //数据库连接
            String url = "jdbc:mysql://192.168.1.2:3306/testdatabase";
            String username = "root";
            String password = "root";
            cn = DriverManager.getConnection(url, username, password);

            //查询  查出与‘SCOTT’从事相同工作的所有员工姓名，工作名称及员工月薪（排除scott自己）
            String sql = "select tp.empName,tp.monthSalary,tt.deptName\n" +
                    " from t_emp tp\n" +
                    "LEFT JOIN t_dept tt ON tp.deptNo = tt.deptNo\n" +
                    "where tp.empName not in (select empName from t_emp where empName = ?);";
            PreparedStatement preparedStatement = cn.prepareStatement(sql);
            preparedStatement.setString(1, "王五");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                System.out.println(resultSet.getString("empName") + "," + resultSet.getString("monthSalary") + "," + resultSet.getString("deptName"));
            }
            cn.close();
            resultSet.close();
            preparedStatement.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    //修改
    @Test
    public void Update() {
        Connection cn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //数据库连接
            String url = "jdbc:mysql://192.168.1.2:3306/testdatabase";
            String username = "root";
            String password = "root";
            cn = DriverManager.getConnection(url, username, password);

            //14.修改
            String sql = "UPDATE t_emp set empSex ='2' where empNo =?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, "1");
            int i = ps.executeUpdate();
            System.out.println(i + "   成功");
            cn.close();
            ps.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }


    // 增加
    @Test
    public void Create() {
        Connection cn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //数据库连接
            String url = "jdbc:mysql://192.168.1.2:3306/testdatabase?characterEncoding=utf-8";
            String username = "root";
            String password = "root";
            cn = DriverManager.getConnection(url, username, password);

            //14.增加
            String sql = "insert into t_emp values(?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, "8");
            ps.setString(2, "10010");
            ps.setString(3, "10001");
            ps.setString(4, "2015-1-1");
            ps.setString(5, "小鸟");
            ps.setString(6, "3");
            ps.executeUpdate();
            cn.close();
            ps.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    //删除
    @Test
    public void Delete(){
        Connection cn = null;
        try {
            //加载驱动
            Class.forName("com.mysql.jdbc.Driver");

            //数据库连接
            String url = "jdbc:mysql://192.168.1.2:3306/testdatabase";
            String username = "root";
            String password = "root";
            cn = DriverManager.getConnection(url, username, password);

            //14.删除
            String str ="DELETE from t_emp where empNo =?";
            PreparedStatement ps = cn.prepareStatement(str);
            ps.setString(1,"8");
            ps.executeUpdate();
            cn.close();

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }
}
