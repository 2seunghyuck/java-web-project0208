package com.basic.day3;

import java.util.Scanner;

public class DoWhileExam {
  public static void main(String[] args) {
    System.out.println("메시지를 입력하세요");
    System.out.println("프로그램을 종료하려면 quit을 입력하세요");
    Scanner sc = new Scanner(System.in);

    String inputString;

    do { // 무조건 한번 실행
      System.out.println(">");
      inputString = sc.nextLine();
      System.out.println(inputString);
    } while(!inputString.equals("quit")); //while문이 true가 아니어도 do 에서 한번 실행한다.
    System.out.println();
    System.out.println("프로그램 종료");
    sc.close();
  }
}
