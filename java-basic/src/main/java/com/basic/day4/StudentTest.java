package com.basic.day4;

public class StudentTest {
  public static void main(String[] args) {

    Student std = new Student();

    std.name = "kim";
    std.rollno = 20180001;
    std.age = 20;

    System.out.println("학생의 이름 : " + std.name);
    System.out.println("학생의 학번 : " + std.rollno);
    System.out.println("학생의 나이 : " + std.age);
  }
}
