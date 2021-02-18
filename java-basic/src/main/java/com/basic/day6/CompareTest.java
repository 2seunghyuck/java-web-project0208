package com.basic.day6;

import java.util.Arrays;

public class CompareTest {
  public static void main(String[] args) {
    Integer a= new Integer(15);
    Integer b= new Integer(10);
    System.out.println(a);
    System.out.println(b);
    int result = a.compareTo(b);
    System.out.println(result);

    int[] arr = {5,4,6,1,7,8};
    Arrays.sort(arr);
    for(int i : arr) {
      System.out.println(i);
    }
  }
}
