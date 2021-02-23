package com.basic.day9;

public class Person implements Comparable<Person> {

  public String name;
  public int age;

  public Person(String name, int age) {
    this.name =name;
    this.age =age;
  }
  @Override
  public int compareTo(Person p) {
    return this.name.compareTo(p.name);
  }
}
