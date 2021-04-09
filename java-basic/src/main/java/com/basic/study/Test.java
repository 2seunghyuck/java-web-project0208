package com.basic.study;

public class Test {
  public int solution(String numbers) {
    int answer = 0;
    String[] split = new String[numbers.length()];

    for(int i=0; i<numbers.length(); i++) {
      split[i] = String.valueOf(numbers.charAt(i));
    }


    return answer;
  }

  public static void main(String[] args) {
    String numbers = "17";
    Test t = new Test();
    t.solution(numbers);
  }

}