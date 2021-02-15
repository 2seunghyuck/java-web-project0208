package com.basic.day2;

import java.util.Scanner;

public class SwitchExam2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    char ch = sc.next().charAt(0);

    if (ch >= 'A' && ch <='Z') System.out.println("대문자입니다");
    else System.out.println("소문자입니다.");

    //    switch(grade) {
    //      case 'A' :
    //      case 'a' : System.out.println("우수회원입니다"); break;
    //
    //      case 'B' :
    //      case 'b' : System.out.println("일반회원입니다"); break;
    //
    //      default : System.out.println("우수회원입니다"); break;
    //    }
  }
}
