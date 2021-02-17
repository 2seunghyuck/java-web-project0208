package com.basic.day4.method;

import java.util.Scanner;

public class RectangleExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("가로와 높이 입력");
    int w = sc.nextInt();
    int h = sc.nextInt();

    Rectangle r = new Rectangle(w, h);
    System.out.println("면적은 > " + r.area(w, h));
  }
}
