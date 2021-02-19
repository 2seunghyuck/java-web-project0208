package com.basic.day7.exception;

public class ExceptionArrayIndex {
  public static void main(String[] args) {
    sub();
  }

  public static void sub() {
    int[] array = new int[10];
    try {
      int i = array[10];
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("정확한 배열을 입력하세요");
    }
  }
}
