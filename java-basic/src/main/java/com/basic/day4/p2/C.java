package com.basic.day4.p2;

import com.basic.day4.p1.A;

public class C {
  public C() {
    A a = new A();
    a.pub_field1 = 1;
    //    a.pac_field2 = 1; => default level 은 다른패키지에서 사용불가
    //    a.field3 = 1;     => private level 은 다른 클래스에서 사용불가

    a.method1();
    //    a.method2(); => default level 은 다른패키지에서 사용불가
    //    a.method3(); => private level 은 다른 클래스에서 사용불가

  }
}
