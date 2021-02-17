package com.basic.day4.p1;

public class B {
  public B() {

    A a = new A();
    a.pub_field1 = 1;
    a.pac_field2 = 1;
    //    a.field3 = 1; => private level 은 다른 클래스에서 사용불가

    a.method1();
    a.method2();
    //    a.method3(); => private level 은 다른 클래스에서 사용불가
  }
}
