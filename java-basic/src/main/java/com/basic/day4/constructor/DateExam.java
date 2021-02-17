package com.basic.day4.constructor;

import java.util.Scanner;

public class DateExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int year, month, day;
    System.out.print("태어난 년도를 입력하세요 : ");
    year = sc.nextInt();
    System.out.print("태어난 월을 입력하세요 : ");
    month = sc.nextInt();
    System.out.print("태어난 일을 입력하세요 : ");
    day = sc.nextInt();

    Date date = new Date(year, month, day);
    date.print();

  }
}
