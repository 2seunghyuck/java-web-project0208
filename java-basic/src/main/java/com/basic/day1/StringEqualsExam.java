package com.basic.day1;

public class StringEqualsExam {
  public static void main(String[] args) {
    String str1 = "java";
    String str2 = "java";
    String str3 = new String("java");

    System.out.println(str1 == str2);
    System.out.println(str1 == str3);
    System.out.println("--------------");
    System.out.println(str1.equals(str2));
    System.out.println(str1.equals(str3));

  }
}
