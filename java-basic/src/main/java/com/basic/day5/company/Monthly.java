package com.basic.day5.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Monthly extends Employee {
  Scanner sc = new Scanner(System.in);
  ArrayList<Employee> list = new ArrayList<Employee>();

  public Monthly() {}
  public Monthly(String name, String id) {
    super(name, id);
  }

  public void input() {

    System.out.println("이름을 입력하세요");
    name = sc.nextLine();
    System.out.println("id를 입력하세요");
    id =sc.nextLine();
    list.add(new Hourly(name,id));
    System.out.println("일한 날짜를 입력하세요");
    int day = sc.nextInt();
    monthly(day);
    System.out.println(name + "님의 이번달 월급은 " + salary + "원 입니다.");
  }
  public void monthly(int day) {
    salary = (200_0000/30) * day;
  }
}
