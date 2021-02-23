package com.basic.day7;

import java.util.Scanner;

class MyArray {
  public static <T extends Comparable> T getMax(T[] a) {
    if (a == null || a.length == 0)
      return null;
    T largest = a[0];
    for (int i=1; i<a.length; i++){
      if (largest.compareTo(a[i]) < 0)
        largest = a[i];
    }
    return largest;
  }
}

public class MaxTest{
  public static void main(String[] args) {
    Integer[] arr = new Integer[5];
    String[] str = new String[5];

    Scanner scan = new Scanner(System.in);
    System.out.print("5개의 정수를 입력하세요 >> ");
    for (int i = 0; i<5; i++){
      arr[i] = scan.nextInt();
    }
    System.out.println("최대값:" + MyArray.getMax(arr));

    System.out.print("5개의 문자열을 입력하세요 >> ");
    for (int i = 0; i<5; i++){
      str[i] = scan.next();
    }
    System.out.println("최대값:" + MyArray.getMax(str));
  }
}

//public class MaxTest {
//  public static void main(String[] args) {
//    Scanner sc = new Scanner(System.in);
//    Integer[] arrInt = new Integer[5];
//    String[] arrStr = new String[5];
//
//    System.out.println("5개의 정수를 입력하세요");
//    for(int i=0; i<arrInt.length; i++) {
//      arrInt[i] = sc.nextInt();
//      sc.nextLine();
//    }
//
//    System.out.println("5개의 문자열을 입력하세요");
//    for(int i=0; i<arrStr.length; i++) {
//      arrStr[i] = sc.nextLine();
//    }
//    System.out.println(getMax(arrInt));
//    System.out.println(getMax(arrStr));
//  }
//
//  public static <T extends Comparable> T getMax(T[] t) {
//    T tmp = t[0];
//    for(int i=0; i<t.length; i++) {
//      if(t[i].toString().charAt(0) > tmp.toString().charAt(0)){
//        tmp = t[i];
//      }
//    }
//    return tmp;
//  }
//}