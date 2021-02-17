package com.basic.day5.company;

import java.util.Scanner;

public class SalaryExam {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    Hourly h = new Hourly();
    Monthly m = new Monthly();

    while(true) {
      System.out.println("1.시급직원 || 2.월급직원 || 3.종료");
      int num = sc.nextInt();
      switch(num) {
        case 1 : h.input(); break;
        case 2 : m.input(); break;
        case 3 : System.exit(0); break;
      }
    }
  }
}
