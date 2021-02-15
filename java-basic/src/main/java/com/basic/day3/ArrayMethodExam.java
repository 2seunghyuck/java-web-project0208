package com.basic.day3;

import java.util.Scanner;

public class ArrayMethodExam {
  Scanner sc = new Scanner(System.in);

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("배열의 크기결정");
    int size = sc.nextInt();
    int[] score = new int[size];

    getValue(score);
    getAverage(score);
    printArray(score);
    System.exit(0);
  }

  public static void getValue(int[] score) {
    Scanner sc = new Scanner(System.in);
    for(int i=0; i < score.length; i++ ) {
      System.out.println("점수 입력");
      score[i] = sc.nextInt();
    }
  }

  public static void getAverage(int[] score) {
    double avg=0;
    double sum =0;
    for(int i=0; i< score.length;i++) {
      sum += score[i];
    }
    avg = sum/score.length;
    System.out.println("평균 : " + avg);
  }

  public static void printArray(int[] score) {
    for(int i=0; i<score.length; i++) {
      System.out.println((i+1) +"번 학생의 점수: " + score[i]);
    }
  }
}
