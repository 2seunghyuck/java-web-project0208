package com.basic.day7;

import java.util.Scanner;

public class Ex_07 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String st = sc.next();
    st.trim();
    String str = "모든프로그램은 자바 언어로 개발될 수 있다.";

    int index = str.indexOf("자바", 0);

    if (index == -1) {
      System.out.println("자바 문자열이 포함되어있지 않습니다.");
    } else {
      System.out.println("자바 문자열이 포함되어 있습니다.");
      str = str.replaceAll("자바", "Java");
      System.out.println("---->" + str);

    }
  }
}
