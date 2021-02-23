package com.basic.day9;

public class Student {
  public int sno;
  public String name;

  public Student(int sno, String name) {
    this.sno =sno;
    this.name =name;
  }


  public int hashcode() {
    System.out.println(sno + name.hashCode());
    return sno + name.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if(obj instanceof Student) {
      Student student = (Student) obj;
      System.out.println(
          ((sno==student.sno) && (name.equals(student.name)) ? true:false));
      return (sno==student.sno) && (name.equals(student.name));
    } else {
      return false;
    }
  }
}