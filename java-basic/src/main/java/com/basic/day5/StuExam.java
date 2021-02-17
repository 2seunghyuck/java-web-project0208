package com.basic.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class StuExam {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    ArrayList<Student> s = new ArrayList<Student>();

    s.add(new Student());
    s.add(new Student());
    s.add(new Student());

    for(Student s1 : s) {
      System.out.print("이름입력 : ");
      s1.setName(sc.nextLine());;
      System.out.println("전화번호 입력 : ");
      s1.setTel(sc.nextLine());
    }

    for(Student s1 : s) {
      System.out.println(s1);
      System.out.println("이름 : "+s1.getName());
      System.out.println("전화번호 : "+s1.getTel());
    }
  }
}
