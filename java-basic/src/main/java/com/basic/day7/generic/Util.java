package com.basic.day7.generic;

public class Util {
  //            타입 파라미터   리턴타입  메서드 명
  public static <T>             Box<T>    boxing(T t) {
    Box<T> box = new Box<>();
    box.set(t);
    return box;
  }
}
