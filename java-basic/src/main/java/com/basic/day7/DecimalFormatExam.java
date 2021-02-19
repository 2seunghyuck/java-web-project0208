package com.basic.day7;

import java.text.DecimalFormat;

public class DecimalFormatExam {
  public static void main(String[] args) {
    double num = 1234567.89;

    DecimalFormat df = new DecimalFormat("#,###.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("\u00A4 #,###.0");
    System.out.println(df.format(num));

    df = new DecimalFormat("#,###.0 %");
    System.out.println(df.format(num));

  }
}
