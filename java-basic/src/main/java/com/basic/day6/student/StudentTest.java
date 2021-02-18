package com.basic.day6.student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("배열의 크기를 입력하세요");
    int num = sc.nextInt();
    sc.nextLine();
    Student[] s = new Student[num];

    for(int i =0; i<s.length; i++) {
      s[i] = new Student();
      System.out.println("학번을 입력하세요 : ");
      String id = sc.nextLine();
      s[i].setId(id);
      System.out.println("이름을 입력하세요 : ");
      String name = sc.nextLine();
      s[i].setName(name);

    }

    System.out.println();

    Arrays.sort(s);
    for(Student i : s) {
      //      System.out.println("학번 : " + i.getId()+ "\t이름 : "+ i.getName());
      System.out.println(i);
    }
  }
}
