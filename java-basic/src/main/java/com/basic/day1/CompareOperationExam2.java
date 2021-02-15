package com.basic.day1;

public class CompareOperationExam2 {
  public static void main(String[] args) {
    int num1= 1;
    double num2 = 1.0;
    System.out.println(num1 == num2);

    double num3 = 0.1;
    float num4 = 0.1f;

    System.out.println(num3 == num4); // 0.1은 정확한 표현이 어려움... 그래서 false
    System.out.println((float)num3 == num4);
    System.out.println((int)(num3*10) == (int)(num4*10));
  }
}
