package com.basic.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDBTest {
  public static Connection makeConnection() {
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String id = "scott";
    String password = "tiger";
    Connection con =null;
    try {
      con=DriverManager.getConnection(url,id,password);
      System.out.println("데이터베이스 연결 성공");
    } catch(SQLException e) {
      System.out.println("연결에 실패하였습니다.");
    }
    return con;
  }
  public static void main(String[] args) {
    Connection con = makeConnection();
  }
}
