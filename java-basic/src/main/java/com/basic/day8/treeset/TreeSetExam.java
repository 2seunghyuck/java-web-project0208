package com.basic.day8.treeset;

import java.util.Scanner;

public class TreeSetExam {
  public static void main(String[] args) {

    TreeSetCollection tsc = new TreeSetCollection();
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("** 회원 관리 프로그램 **");
      System.out.println("1.회원 추가 || 2.회원 삭제 || 3.전체회원 출력 || 4.종료 ");
      int choice = sc.nextInt();
      sc.nextLine();
      switch(choice) {
        case 1 : tsc.add(); break;
        case 2 : tsc.delete(); break;
        case 3 : tsc.print(); break;
        case 4 : System.exit(0);break;
      }
    }
  }
}
