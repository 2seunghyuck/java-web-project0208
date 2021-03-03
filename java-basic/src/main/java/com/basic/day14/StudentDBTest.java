package com.basic.day14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDBTest {
  public static void main(String[] args) {
    String url = "jdbc:oracle:thin:@localhost:1521:XE";
    String id = "scott2";
    String password = "tiger";
    Connection con =null;
    Statement stmt = null;
    ResultSet rs = null;
    String showList = "select * from student";
    try {
      Class.forName("oracle.jdbc.driver.OracleDriver"); // oracle 드라이버 로드
      con=DriverManager.getConnection(url,id,password); // JDBC 연결
      System.out.println("DB 연결 완료");
      stmt = con.createStatement(); // SQL문 처리용 statement 객체 생성
      String sql1 = "insert into student values('100400', 'kim', '영어과')";
      stmt.executeUpdate(sql1);
      rs = stmt.executeQuery(showList);
      while(rs.next()) {
        System.out.print(rs.getString("id") + ",");
        System.out.print(rs.getString("name") + ",");
        System.out.print(rs.getString("dept"));
        System.out.println();
      }
      con.commit();
    } catch(ClassNotFoundException e) {
      System.out.println("드라이버를 찾을 수 없습니다.");
    } catch(SQLException e) {
      System.out.println("SQL 실행 오류");
    } finally {
      try {
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(con != null) con.close();
      } catch(Exception e) {}
    }
  }
}
