package com.basic.day3;

import java.util.Scanner;

public class ArrayTestExam {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    double[] score = new double[3];

    double sum =0;
    double avg = 0;


    for(int i=0; i <3; i++) {
      System.out.println("점수 입력");
      score[i] = sc.nextDouble();
      sum += score[i];
    }

    avg = sum / 3.0;
    System.out.println("합계: " + sum);
    System.out.println("평균: " + avg);
  }

}
