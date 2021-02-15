package com.basic.day3;

public class MultiDimensionArrayExam {
  public static void main(String[] args) {

    // 행마다 열의 갯수가 다른 배열 생성하기
    int[][] scores = new int[2][];
    scores[0] = new int[2]; // 1행은 2열
    scores[1] = new int[3]; // 2행은 3열

    System.out.println(scores.length);
    System.out.println(scores[0].length);
    System.out.println(scores[1].length);

  }
}
