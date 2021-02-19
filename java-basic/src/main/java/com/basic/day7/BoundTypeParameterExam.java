package com.basic.day7;

public class BoundTypeParameterExam {
  public static void main(String[] args) {

    //    String str =Util.compare("a", "b"); -> Number Type을 갖지 않으므로 컴파일 에러

    int result1 =Util.compare(10, 20);
    System.out.println(result1);
    int result2 =Util.compare(4.6, 20);
    System.out.println(result2);
    int result3 =Util.compare(10, 10);
    System.out.println(result3);
  }
}
