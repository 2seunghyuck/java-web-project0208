package com.basic.day9;

import java.util.HashMap;

public class HashMapExam2 {
  public static void main(String[] args) {

    HashMap<Student, Integer> map = new HashMap<Student, Integer>();

    Student s = new Student(1,"홍길동");
    map.put(new Student(1,"홍길동"), 95);
    map.put(new Student(1,"홍길동"), 95);
    map.put(s, 95);

    System.out.println("Entry수 ? :" + map.size());

  }
}
