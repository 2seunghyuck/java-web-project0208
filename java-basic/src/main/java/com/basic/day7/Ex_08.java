package com.basic.day7;

import java.util.StringTokenizer;

public class Ex_08 {
  public static void main(String[] args) {
    String str = "오늘은 자바수업 마지막 주이다. 다음주는 기말고사를 시반에 본다.";
    int count=0;

    StringTokenizer st = new StringTokenizer(str," ");
    int countToken = st.countTokens();
    System.out.println(countToken);
    while(st.hasMoreTokens()) {
      String print = st.nextToken();
      System.out.print(print + ",");
      count++;
    }
    System.out.println();
    System.out.println("단어의 갯수는 " + count+ "개 입니다.");
  }
}
