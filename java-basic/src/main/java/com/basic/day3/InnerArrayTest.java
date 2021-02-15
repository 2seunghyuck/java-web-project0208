package com.basic.day3;

public class InnerArrayTest {
  public static void main(String[] args) {

    int[][] stuScore = {{40,50,60},{80,84,90}};
    double avg=0;

    for(int i=0; i<stuScore.length; i++) {
      int total=0;
      for(int k=0; k<stuScore[i].length; k++) {
        total += stuScore[i][k];
        avg = (double) total/stuScore[i].length;
      }
      System.out.println((i+1)+"번 학생의 총점" + total);
      System.out.println((i+1)+"번 학생의 평균" + avg);
    }

  }
}
