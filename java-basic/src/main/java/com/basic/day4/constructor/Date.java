package com.basic.day4.constructor;

public class Date {
  int year;
  int month;
  int day;

  Date(int year, int month, int day) {
    this.year = year;
    this.month = month;
    this.day = day;
  }
  public void print() {
    System.out.println(year+"년" + month+"월" + day+"일");
  }
}
