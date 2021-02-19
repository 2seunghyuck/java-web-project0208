package com.basic.day7;

import java.util.StringTokenizer;

public class StringSplitExam {
  public static void main(String[] args) {
    String text = "홍길동&이수홍,  박연수, 김자바-최명호";
    StringTokenizer st = new StringTokenizer(text, ",");
    StringTokenizer st2 = new StringTokenizer(text, "-");
    while(st.hasMoreTokens()) {
      String token = st.nextToken();
      System.out.println(token);

    }
    //    String[] names = text.split("&|,| |-");
    //    for(String name : names) {
    //      System.out.println(name);
    //    }
  }
}
