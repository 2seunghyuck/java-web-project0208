package com.basic.day9.Test0223.prob_03;

public class Member implements Comparable<Member>{

  private String id;
  private String name;

  public Member(String id, String name) {
    super();
    this.id = id;
    this.name = name;
  }

  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  @Override
  public String toString() {
    return "Name = ["+name+"] \t Id = [" +id+"]";
  }
  @Override
  public int compareTo(Member m) {
    return this.name.compareTo(m.name);
  }
}
