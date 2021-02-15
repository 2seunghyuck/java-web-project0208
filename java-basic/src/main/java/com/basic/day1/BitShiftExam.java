package com.basic.day1;

public class BitShiftExam {
  public static void main(String[] args) {
    System.out.println("1 << 3 = " + (1<<3));
    System.out.println("-8 >> 3 = " + (-8>>3));
    System.out.println("-8 >>> 3 = " + (-8>>>3));
    System.out.println("------------------------");
    System.out.println(toBInaryString(1));
    System.out.println("<< 3");
    System.out.println(toBInaryString(1<<3));
    System.out.println("------------------------");
    System.out.println(toBInaryString(-8));
    System.out.println(">>> 3");
    System.out.println(toBInaryString(-8>>>3));
  }
  public static String toBInaryString(int value) {
    String str = Integer.toBinaryString(value);
    while(str.length() < 32) {
      str = "0" + str;
    }
    return str;
  }
}
