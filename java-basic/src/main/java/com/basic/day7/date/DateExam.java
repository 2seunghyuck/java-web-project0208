package com.basic.day7.date;

import java.util.Scanner;

public class DateExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    DateC d = new DateC();

    System.out.println("태어난 년도를 입력하세요");
    int year = sc.nextInt();
    d.setYear(year);
    System.out.println("태어난 월을 입력하세요");
    int month = sc.nextInt();
    d.setMonth(month);
    System.out.println("태어난 일을 입력하세요");
    int day = sc.nextInt();
    d.setDay(day);
    d.print();
  }
}
