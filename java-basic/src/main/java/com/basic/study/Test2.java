package com.basic.study;

public class Test2{
  public String[] solution(int n, int[] arr1, int[] arr2) {
    String binaryString;
    for(int i=0; i<arr1.length;i++) {
      binaryString = Integer.toBinaryString(arr1[i]);
      System.out.println(binaryString);
    }

    // bit연산하는거 해보면 될듯 ?

    String[] answer = {};

    return answer;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    int n = 5;
    int[] arr1 = {9, 20, 28, 18, 11};
    int[] arr2 = {30, 1, 21, 17, 28};

    System.out.println(t.solution(n, arr1, arr2));
  }
}