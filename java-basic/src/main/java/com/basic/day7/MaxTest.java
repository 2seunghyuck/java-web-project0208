package com.basic.day7;

import java.util.Scanner;

public class MaxTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Integer[] arrInt = new Integer[5];
    String[] arrStr = new String[5];

    System.out.println("5개의 정수를 입력하세요");
    for(int i=0; i<arrInt.length; i++) {
      arrInt[i] = sc.nextInt();
      sc.nextLine();
    }

    System.out.println("5개의 문자열을 입력하세요");
    for(int i=0; i<arrStr.length; i++) {
      arrStr[i] = sc.nextLine();
    }
    System.out.println(getMax(arrInt));
    System.out.println(getMax(arrStr));
  }

  public static <T> T getMax(T[] t) {
    T tmp = t[0];

    for(int i=0; i<t.length; i++) {
      if(t[i].toString().charAt(0) > tmp.toString().charAt(0)) {
        tmp = t[i];
      }
    }
    return tmp;
  }
}