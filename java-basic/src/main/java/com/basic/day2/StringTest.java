package com.basic.day2;

import java.util.Scanner;

public class StringTest {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    boolean btn = true;

    while(btn) {
      System.out.println("주민등록번호를 입력하세요 (yymmdd-*******)");
      String str = sc.next();
      switch (str.charAt(7)) {
        case '1' :
        case '3' : System.out.println("남자입니다."); break;
        case '2' :
        case '4' : System.out.println("여자입니다."); break;
        default : btn =false;
      }
      System.out.println("계속 입력하시겠습니까 ?(y/N)");
      String conti = sc.next();
      if (conti.equals("n")) btn = false;
    }
  }
}
//if (str.charAt(7) == '1'|| str.charAt(7) == '3') System.out.println("남자입니다.");
//else if (str.charAt(7) == '2' || str.charAt(7) == '4') System.out.println("여자입니다.");
//else System.out.println("잘못된 주민등록번호입니다.");
