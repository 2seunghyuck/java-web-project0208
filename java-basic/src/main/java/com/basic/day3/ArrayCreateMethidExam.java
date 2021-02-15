package com.basic.day3;

public class ArrayCreateMethidExam {
  public static void main(String[] args) {

    int[] scores = {85,90,95};
    int sum1 = 0;
    double[] scores1 = {99.0,44.0,66.3};

    for(int i=0; i < 3; i++) {
      sum1 += scores[i];
    }
    System.out.println("sum1: " + sum1);

    int sum2 = add(scores);
    System.out.println("sum2: "  + sum2);

    int[] tmp = new int[scores.length];
    for(int i=0; i<scores1.length; i++) {
      tmp[i] = (int)scores1[i];
    }
    int sum3 = add(tmp);
    System.out.println(sum3);

    double sum4 = add(scores1);
    System.out.println(sum4);

  }

  public static int add(int[] scores) {
    int sum = 0;
    for(int i=0; i < scores.length; i++) {
      sum += scores[i];
    }
    return sum;
  }

  public static double add(double[] scores) { // add 오버라이딩
    double sum = 0;
    for(int i=0; i < scores.length; i++) {
      sum += scores[i];
    }
    return sum;
  }

}
