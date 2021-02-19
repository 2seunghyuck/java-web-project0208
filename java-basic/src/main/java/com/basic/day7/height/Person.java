package com.basic.day7.height;

public class Person implements Comparable<Person> {
  String name;
  double height;

  public Person() {}

  public Person(String name, double height) {
    this.name = name;
    this.height = height;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public double getHeight() {
    return height;
  }
  public void setHeight(double height) {
    this.height = height;
  }

  @Override
  public int compareTo(Person p) {
    return (this.name.compareTo(p.name));
  }

  @Override
  public String toString() {
    return "이름 : " + name + "\t키 : " + height;
  }

}
