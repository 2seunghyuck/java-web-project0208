package com.basic.day4;

public class SingletonExam {
  // SingletonPattern => getInstance 를이용해 한가지의 인스턴스만 생성해 공유한다.
  //                     original 을 훼손시키지 않고 객체 공유가능
  public static void main(String[] args) {
    // SingletonPattern obj1 = new SingletonPattern();
    // SingletonPattern obj2 = new SingletonPattern();

    SingletonPattern obj1 = SingletonPattern.getInstance();
    SingletonPattern obj2 = SingletonPattern.getInstance();

    if (obj1 == obj2) {
      System.out.println("같은 singleton 객체입니다.");
    }else {
      System.out.println("다른 singleton 객체입니다.");
    }
  }
}
