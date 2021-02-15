package com.basic.day3;

public class BreakOutterExam {
  public static void main(String[] args) {

    Outter : // <- label (이름은 상관없음)

      for (char upper='A'; upper<='Z'; upper++) {
        for(char lower='a'; lower<='z'; lower++) {
          System.out.println(upper + "-" + lower);
          if(lower == 'g') {
            break Outter; // label 을 사용하여 반복문을 빠져나가기
          }
        }
      }
  System.out.println("프로그램 종료");
  }
}
