package com.basic.day3;

import java.util.Scanner;

public class ForEachExam {
  public static void main(String[] args) {
    int size;
    System.out.println("배열의 크기는");
    Scanner sc = new Scanner(System.in);
    size = sc.nextInt();
    String[] arr = new String[size];

    for(int i=0; i <arr.length; i++) {
      System.out.println("배열에 저장할 문자열을 입력하세요" + (arr.length-i));
      arr[i] = sc.next();
    }
    for(String s : arr) {
      System.out.println(s);
    }
  }
}

//    Scanner sc = new Scanner(System.in);
//    int[] scores = {65,86,89,65,98};
//    int sum =0;
//    for(int score : scores) {
//      sum += score;
//    }
//    System.out.println("점수 합계 : " + sum);
//    double avg = (double) sum/scores.length;
//    System.out.println("점수 평균 : " + avg);
//
//    System.out.println("글자 분리");
//    String str = sc.nextLine();
//
//    for(char one : str.toCharArray()) {
//      System.out.print(one + "*");
//    }