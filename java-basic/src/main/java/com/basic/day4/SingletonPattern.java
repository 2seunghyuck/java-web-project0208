package com.basic.day4;

public class SingletonPattern {
  private static SingletonPattern singleton = new SingletonPattern();

  private SingletonPattern() {}

  static SingletonPattern getInstance() {
    return singleton;
  }
}
