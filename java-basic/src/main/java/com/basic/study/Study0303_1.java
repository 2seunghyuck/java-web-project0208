package com.basic.study;

import java.util.ArrayList;
import java.util.List;

public class Study0303_1 {
  public int[] solution(int[] arr) {
    List<Integer> list = new ArrayList<>();
    for(int i=0; i<arr.length-1; i++) {
      if(arr[i]!=arr[i+1]) list.add(arr[i]);
    }
    list.add(arr[arr.length-1]);
    int[] answer = new int[list.size()];
    int tmp =0;
    for(int i : list) {
      answer[tmp] = i;
      tmp++;
    }
    return answer;
  }
  public static void main(String[] args) {
    int[] arr = {1,1,3,3,0,1,1};
    Study0303_1 t = new Study0303_1();
    t.solution(arr);

  }
}
