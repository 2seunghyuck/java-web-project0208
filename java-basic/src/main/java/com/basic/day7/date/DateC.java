package com.basic.day7.date;

import java.text.SimpleDateFormat;

public class DateC {
  private int year;
  private int month;
  private int day;

  public int getYear() {
    return year;
  }
  public void setYear(int year) {
    this.year = year;
  }
  public int getMonth() {
    return month;
  }
  public void setMonth(int month) {
    this.month = month;
  }
  public int getDay() {
    return day;
  }
  public void setDay(int day) {
    this.day = day;
  }

  public void print() {
    java.util.Date d = new java.util.Date();
    System.out.println("당신의 생일은 "+getYear()+"년"+getMonth()+"월"+getDay()+"일 입니다.");
    SimpleDateFormat de = new SimpleDateFormat("yyyy");
    String str2 = de.format(d);
    int yearNow=Integer.parseInt(str2);
    System.out.println("당신의 나이는 " + (yearNow-getYear()+1) + " 살입니다.");
  }

}
