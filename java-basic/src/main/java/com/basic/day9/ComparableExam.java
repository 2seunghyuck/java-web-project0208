package com.basic.day9;

import java.util.Iterator;
import java.util.TreeSet;

public class ComparableExam {
  public static void main(String[] args) {
    TreeSet<Person> ts = new TreeSet<>();
    ts.add(new Person("홍길동", 45));
    ts.add(new Person("김자바", 32));
    ts.add(new Person("박지원", 18));
    Iterator<Person> ite = ts.iterator();

    while(ite.hasNext()) {
      Person person = ite.next();
      System.out.println(person.name+" : " + person.age);
    }

  }
}
