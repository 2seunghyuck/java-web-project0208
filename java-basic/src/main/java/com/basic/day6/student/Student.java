package com.basic.day6.student;

public class Student implements Comparable<Student>{
  private String name;
  private String id;

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  @Override
  public int compareTo(Student s) {
    return (this.id.compareTo(s.id));
  }
  @Override
  public String toString() { // 객체 출력할때 사용하면편하대
    return "학번 : " + id + "이름 : " + name;
  }

}
