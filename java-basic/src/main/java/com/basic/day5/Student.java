package com.basic.day5;

public class Student {
  private String name;
  private String tel;

  public String getName() {
    return name;
  }
  public Student() {}
  public Student(String name, String tel) {
    super();
    this.name = name;
    this.tel = tel;
  }
  public void setName(String name) {
    this.name = name;
  }
  public String getTel() {
    return tel;
  }
  public void setTel(String tel) {
    this.tel = tel;
  }

}
