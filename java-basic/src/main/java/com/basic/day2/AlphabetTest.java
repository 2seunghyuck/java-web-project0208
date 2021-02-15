package com.basic.day2;

import java.util.Scanner;

public class AlphabetTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("문자 입력 : ");
    char ch = sc.next().charAt(0);
    System.out.println("=====결과 =====");
    if(ch>='A' && ch<='Z')
    {
      System.out.println("대문자가 입력됨.");
      ch += (char)('a' - 'A');
      System.out.print(ch);
    }
    else if(ch>='a'&&ch<='z')
    {
      System.out.println("소문자가 입력됨.");
      ch -= (char)('a' - 'A');
      System.out.print(ch);
    }
    else
      System.out.println("영문자가 아니므로 다시 입력: ");

    //    String alp;
    //    System.out.println("문자를 입력하세요");
    //    alp = sc.next();
    //    alp.charAt(0);
    //    if(alp.charAt(0) >= 'a' && alp.charAt(0) <= 'z') {alp = alp.toUpperCase();}
    //    else if (alp.charAt(0) >= 'A' && alp.charAt(0) <= 'Z') {alp = alp.toLowerCase();}
    //    System.out.println(alp);
  }
}
