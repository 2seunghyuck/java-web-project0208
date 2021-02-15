package com.basic.day3;

import java.util.Calendar;

public class EnumTypeExam {
  public static void main(String[] args) {
    Week today = null;

    Calendar cal = Calendar.getInstance();
    int week = cal.get(Calendar.DAY_OF_WEEK);
    for(Week s : Week.values()) {
      System.out.println(s);
    }
    switch(week) {
      case 2 : today = Week.MONDAY; break;
      case 3 : today = Week.TUESDAY; break;
      case 4 : today = Week.WEDNESDAY; break;
      case 5 : today = Week.TUESDAY; break;
      case 6 : today = Week.FRIDAY; break;
      case 7 : today = Week.SATURDAY; break;
      case 1 : today = Week.SUNDAY; break;
    }
    System.out.println("오늘은 ? " + today);
    if(today == Week.SUNDAY) {
      System.out.println("일요일에는 짜파게티");
    } else {
      System.out.println("자바공부 하기");
    }
  }
}
