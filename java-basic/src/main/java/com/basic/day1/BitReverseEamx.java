package com.basic.day1;

public class BitReverseEamx {
  public static void main(String[] args) {
    String s1 = Integer.toBinaryString(-10);
    String s2 = Integer.toBinaryString(10);
    System.out.println(s1);
    System.out.println(s2);
    System.out.println("----------------------------");

    int v1 = 10;
    int v2 = ~v1;
    int v3 = ~v1 +1;
    System.out.println(toBinaryString(v1) + "(십진수로 표현" + v1 +")");
    System.out.println(toBinaryString(v2) + "(십진수로 표현" + v2+")");
    System.out.println(toBinaryString(v3) + "(십진수로 표현" + v3+")");
    System.out.println("----------------------------");

    int v4 = -10;
    int v5 = ~v4;
    int v6 = ~v4 +1;
    System.out.println(toBinaryString(v4) + "(십진수로 표현" + v4+")");
    System.out.println(toBinaryString(v5) + "(십진수로 표현" + v5+")");
    System.out.println(toBinaryString(v6) + "(십진수로 표현" + v6+")");
    System.out.println("----------------------------");

  }

  public static String toBinaryString(int value) {
    String str = Integer.toBinaryString(value);
    while(str.length() < 32) {
      str = "0" + str;
    }
    return str;
  }
}
