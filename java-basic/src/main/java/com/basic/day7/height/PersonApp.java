package com.basic.day7.height;

import java.util.Arrays;

public class PersonApp {
  public static void main(String[] args) {
    Person[] arr;
    arr = new Person[5];
    arr[0] = new Person("홍길동", 190);
    arr[1] = new Person("김길동", 170);
    arr[2] = new Person("이길동", 220);
    arr[3] = new Person("차길동", 200);
    arr[4] = new Person("정길동", 160);

    Arrays.sort(arr);
    for(Person p : arr) {
      System.out.println(p);
    }

    System.out.println(getMax(arr));
  }

  public static Person getMax(Person[] arr) {

    for(int i=0;i< arr.length; i++) {
      Person tmp;
      for (int k = i+1; k<arr.length;k++)
        if(arr[i].height < arr[k].height) {
          tmp = arr[k];
          arr[k] = arr[i];
          arr[i] = tmp;
        }
    }
    //    for(int i=0;i< arr.length; i++) {
    //      if(tmp.height < arr[i].height) {
    //        tmp = arr[i];
    //      }
    //    }
    System.out.println(arr[0].height);
    System.out.println(arr[1].height);
    System.out.println(arr[2].height);
    System.out.println(arr[3].height);
    System.out.println(arr[4].height);
    return arr[0];
  }
}
