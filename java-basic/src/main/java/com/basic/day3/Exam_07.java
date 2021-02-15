package com.basic.day3;

import java.util.Scanner;

public class Exam_07 {
  public static void main(String[] args) {
    boolean run = true;
    int balance = 0;

    Scanner sc = new Scanner(System.in);
    while(run) {
      int input = 0;
      int output = 0;
      System.out.println("-----------------------------------");
      System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료 ");
      System.out.println("-----------------------------------");
      System.out.println("선택 > ");
      int choice = sc.nextInt();
      switch(choice) {
        case 1 : System.out.println("예금액 입력 > "); input = sc.nextInt(); balance += input; break;
        case 2 : System.out.println("출금액 입력 > "); output = sc.nextInt(); balance -= output; break;
        case 3 : System.out.println("잔고 출력 > " + balance); break;
        case 4 : System.out.println("종료"); run = false; break;
      }
    }
  }
}
