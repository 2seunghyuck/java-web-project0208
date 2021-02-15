package com.basic.day1;

public class Exam {
  public static void main(String[] args) {

    //Q.6
    int lengthTop = 5;
    int lengthBottom = 10;
    int height = 7;
    double area = (double)((lengthTop + lengthBottom) * height ) / 2;
    System.out.println(area);

    //Q.7
    int x = 10;
    int y = 5;

    System.out.println((x>7) && (y<=5));
    System.out.println((x%3 == 2) || (y%2 != 1));
  }
}
