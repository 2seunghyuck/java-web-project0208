package com.basic.day9.Test0223.prob_02;

public class Member {
  private String name;

  public Member(String name) {
    super();
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "["+name+"]";
  }

  //  @Override
  //  public int compareTo(Member m) {
  //    return name.compareTo(m.name);
  //  }

}
