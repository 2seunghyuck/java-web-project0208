package com.basic.day5.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Hourly extends Employee{
  ArrayList<Employee> list = new ArrayList<Employee>();

  public Hourly() {
  }
  public Hourly(String name, String id) {
    super(name, id);
  }

  Scanner sc = new Scanner(System.in);

  public void input() {
    System.out.println("이름을 입력하세요");
    name = sc.nextLine();
    System.out.println("id를 입력하세요");
    id =sc.nextLine();
    list.add(new Hourly(name,id));
    System.out.println("일한시간 >");
    int time = sc.nextInt();
    hourly(time);

    System.out.println(name + "님의 급여" + salary);

  }
  public void hourly(int time) {
    salary = time*9000;
  }

}
