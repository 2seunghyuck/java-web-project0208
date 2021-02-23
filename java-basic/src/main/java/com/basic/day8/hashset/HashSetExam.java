package com.basic.day8.hashset;

import java.util.Scanner;

public class HashSetExam {
  public static void main(String[] args) {
    HashSetCollection hsc = new HashSetCollection();
    Scanner sc = new Scanner(System.in);

    while(true) {
      System.out.println("** 회원 관리 프로그램 **");
      System.out.println("1.회원 추가 || 2.회원 삭제 || 3.전체회원 출력 || 4.종료 ");
      int choice = sc.nextInt();
      sc.nextLine();
      switch(choice) {
        case 1 : hsc.add(); break;
        case 2 : hsc.delete(); break;
        case 3 : hsc.print(); break;
        case 4 : System.exit(0);break;
      }
    }
  }
}
