package com.basic.day2;

import java.util.Scanner;

public class Day2Example {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int total =0;
    double avg;
    int cnt = -1;
    while(true) {
      System.out.println("점수를 입력하세요 (종료 =0)");
      int stu = sc.nextInt();
      total += stu;
      cnt++;
      if (stu == 0) break;
    }
    avg = total/cnt;
    System.out.println("--------------------------------");
    System.out.print("평균 : ");
    for(int i=0; i<avg; i++) {
      System.out.print("*");
    }
  }
}
