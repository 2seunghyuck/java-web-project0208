package com.basic.day2;

import java.util.Scanner;

public class AvgIntegerTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    boolean stop = true;
    int tmp;
    int sum = 0;
    int count = 0;
    double avg;
    while(stop) {
      System.out.println("숫자를 입력하세요 (종료:0)");
      tmp = sc.nextInt();
      if(tmp == 0) { stop = false;
      }else {
        sum += tmp;
        count++;
      }
    }
    avg = sum/count;
    System.out.println("평균 : " + avg);
  }
}
