package com.basic.day3;

public class ArrayCreateByNewExam {
  public static void main(String[] args) {
    int[] arr1 = new int[3];
    for(int i=0; i <3; i++) {
      System.out.println("arr[" + i + "] : " + arr1[i]); // int 타입의 기본값은 0
    }

    arr1[0] = 10;
    arr1[1] = 20;
    arr1[2] = 30;

    for(int i=0; i <3; i++) {
      System.out.println("arr[" + i + "] : " + arr1[i]);
    }

    String[] arr2 = new String[3];

    for(int i=0; i <3; i++) {
      System.out.println("arr[" + i + "] : " + arr2[i]); // String 타입의 기본값은 null
    }

    arr2[0] = "A";
    arr2[1] = "B";
    arr2[2] = "C";

    for(int i=0; i <3; i++) {
      System.out.println("arr[" + i + "] : " + arr2[i]);
    }
  }
}
