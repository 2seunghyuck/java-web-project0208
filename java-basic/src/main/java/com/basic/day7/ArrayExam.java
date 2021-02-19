package com.basic.day7;

import java.util.Arrays;

public class ArrayExam {
  public static void main(String[] args) {

    int[] arrInt = {10,20,30,40,50};
    char[] arrChar = {'a','b','c','d','e'};

    for(int i : arrInt) {
      System.out.println(i);
    }
    for(char c : arrChar) {
      System.out.println(c);
    }
    System.out.println("---------------------");
    System.out.println(Arrays.toString(arrInt));
    System.out.println(Arrays.toString(arrChar));
    System.out.println("---------------------");
    System.out.println(arrInt);
    System.out.println(arrChar);
  }
}
