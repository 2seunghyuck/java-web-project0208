package com.basic.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public static int solution(String numbers) {
    int answer = 0;
    String[] split = new String[numbers.length()];
    List<Integer> numList = new ArrayList<>();
    for(int i=0; i<numbers.length(); i++) {
      split[i] = String.valueOf(numbers.charAt(i));
    }
    Arrays.sort(split);


    for(String s : split) {
      System.out.println(s);
    }
    //      if(findSosu(Integer.parseInt(split[i])) == true) answer++;
    return answer;
  }



  public static boolean findSosu(int answer) {
    int count=0;
    boolean sosu = false;
    for(int i=0; i<answer; i++) {
      if(answer % i == 0) count++;
    }
    if(count == 2) sosu = true;
    return sosu;
  }

  public static void main(String[] args) {
    String numbers = "17";
    Test t = new Test();
    t.solution(numbers);
  }

}