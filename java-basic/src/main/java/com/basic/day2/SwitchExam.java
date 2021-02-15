package com.basic.day2;

public class SwitchExam {
  public static void main(String[] args) {
    int num = (int)(Math.random() * 10) +1;
    int tmp = num % 2;

    switch(tmp) {
      case 1 : System.out.println("홀수입니다."); break;
      case 0 : System.out.println("짝수입니다."); break;
    }

    //    switch(num) {
    //      case 1: System.out.println("1번이 나왔습니다."); break;
    //      case 2: System.out.println("2번이 나왔습니다."); break;
    //      case 3: System.out.println("3번이 나왔습니다."); break;
    //      case 4: System.out.println("4번이 나왔습니다."); break;
    //      case 5: System.out.println("5번이 나왔습니다."); break;
    //      case 6: System.out.println("6번이 나왔습니다."); break;
    //    }
  }
}
