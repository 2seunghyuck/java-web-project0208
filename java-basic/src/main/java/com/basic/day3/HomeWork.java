package com.basic.day3;

import java.util.Scanner;

public class HomeWork {
  // 2차배열에 회원의 이름,전화번호를 입력받고, 배열의 내용을 출력한다.
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    boolean run = true;
    int members = 0;
    while(run) {
      String[][] info;
      System.out.println("1.회원수 | 2.정보입력 | 3.회원리스트 | 4.종료");
      int choice = sc.nextInt();
      info = new String[members][2];
      switch(choice) {
        case 1 : System.out.println("회원수 ? "); members = sc.nextInt(); break;
        case 2 : inputInfo(info); break;
        case 3 : memberInfo(info); break;
        case 4 : run = false; break;
      }
    }
  }

  public static String[][] inputInfo(String[][] info) {
    Scanner sc = new Scanner(System.in);

    for(int i=0; i<info.length; i++) {
      System.out.println("이름을 입력하세요 : ");
      String name = sc.next();
      info[i][0] = name;
      System.out.println("전화번호를 입력하세요 : ");
      String tel = sc.next();
      info[i][1] = tel;
    }
    return info;
  }
  public static void memberInfo(String[][] info) {
    System.out.println("***회원정보***");
    for(int i=0; i<info.length; i++) {
      for(int k=0; k<info[i].length; k++) {
        System.out.println(info[i][k]);
      }
    }
  }
}
