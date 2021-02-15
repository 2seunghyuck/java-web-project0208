package com.basic.day3;

public class ContinueExam {
  public static void main(String[] args) {
    for (int i=0; i <= 50; i ++) {
      if(i%3 != 0 ) {
        continue;
      }
      System.out.println(i);
    }
  }
}
