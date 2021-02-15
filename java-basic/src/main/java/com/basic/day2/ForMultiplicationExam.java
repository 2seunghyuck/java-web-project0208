package com.basic.day2;

import java.util.Scanner;

public class ForMultiplicationExam {
  public static void main(String[] args) {
    //    for (int i=2; i <9; i++) {
    //      System.out.println("***" + i + "***");
    //      for (int j=1; j<=9; j++) {
    //        System.out.println(i + "x" + j);
    //      }
    //    }

    //    int max = sc.nextInt();
    //    System.out.println("숫자를 입력하세요");
    //    for(int i =1; i <= max; i++) {
    //      if (i % 3 == 0) {total += i;}
    //    }

    int total=0;
    float avg;
    Scanner sc = new Scanner(System.in);
    System.out.println("몇개의 난수의 합을 구하시겠습니까 ?");
    int vari = sc.nextInt();
    for (int i =0; i < vari; i++) {
      int rnd = (int)(Math.random() * 100) +1;
      total += rnd;
    }
    avg = total / vari;
    System.out.println("총합" + total);
    System.out.println("평균" + avg);
  }

}
