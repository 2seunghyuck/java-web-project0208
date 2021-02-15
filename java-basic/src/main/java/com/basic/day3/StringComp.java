package com.basic.day3;

public class StringComp {
  public static void main(String[] args) {
    String str = new String("String");
    String str1 = new String("String");
    System.out.println(str);
    str = str1;
    System.out.println(str == str1);

  }
}
