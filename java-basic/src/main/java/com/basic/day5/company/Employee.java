package com.basic.day5.company;

public class Employee {

  protected String id;
  protected String name;
  protected int salary;

  public Employee() {
  }
  public Employee(String name, String id) {
    this.name = name;
    this.id = id;
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
  public int getSalary() {
    return salary;
  }
  public void setSalary(int salary) {
    this.salary = salary;
  }

}
