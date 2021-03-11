package com.basic.study;

import java.util.Calendar;

public class Study0306{
  public String solution(int a, int b) {
    String[] day = {"","SUN","MON","TUE","WED","THU","FRI","SAT"};
    Calendar date = Calendar.getInstance();
    date.set(2016, a-1,b);
    String answer = day[date.get(Calendar.DAY_OF_WEEK)];

    return answer;
  }
  public static void main(String[] args) {
    Study0306 t = new Study0306();
    t.solution(5,23);
    System.out.println(t.solution(5,23));
  }
}