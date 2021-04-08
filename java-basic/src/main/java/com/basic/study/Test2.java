package com.basic.study;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Test2{
  public int solution(int[] priorities, int location) {
    int answer = 0;
    Queue<Integer> list = new LinkedList<>();

    for(int i : priorities) {
      list.add(i);
    }

    Arrays.sort(priorities);
    int length = priorities.length-1;

    while(!list.isEmpty()){
      int tmp = list.poll();

      if(tmp == priorities[length - answer]){
        answer++;
        location--;
        if(location<0){
          break;
        }
      }else{
        list.add(tmp);
        location--;
        if(location<0){
          location = list.size()-1;
        }
      }
    }
    System.out.println(answer);
    return answer;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    int[] priorities = {2, 1, 3, 2};
    int location = 2;

    t.solution(priorities, location);
  }
}