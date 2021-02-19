package com.basic.day7;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SImpleDateFormatExam {
  public static void main(String[] args) {
    Date now = new Date();
    String str = now.toString();
    System.out.println(str);
    SimpleDateFormat de = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
    String str2 = de.format(now);
    System.out.println(str2);

  }
}
