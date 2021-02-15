package com.basic.day3;

public class ArrayCreateExam {
  public static void main(String[] args) {

    //    int[] scores;
    //    scores = {1, 2, 3};  <-이렇게 값을 입력하는것은 안됨, new 로 객체를 생성해야함

    int[] scores = {85,90,95};
    System.out.println("scores[0]: " + scores[0]);
    System.out.println("scores[1]: " + scores[1]);
    System.out.println("scores[2]: " + scores[2]);
    int sum = 0;
    for(int i=0; i < 3; i++) {
      sum += scores[i];
    }
    System.out.println("sum: " + sum);
  }
}
