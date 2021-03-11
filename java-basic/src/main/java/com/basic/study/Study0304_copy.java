package com.basic.study;

import java.util.Arrays;

public class Study0304_copy {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer= new int[commands.length];
    for(int i=0; i<commands.length;i++) {
      Arrays.sort(array, commands[i][0]-1, commands[i][1]);
      answer[i] = array[(commands[i][0]+commands[i][2]-2)];
    }
    for(int i: answer) {
      System.out.println(i);
    }
    return answer;
  }
  public static void main(String[] args) {
    Study0304_copy t = new Study0304_copy();
    int[] arr = {1, 5, 2, 6, 3, 7, 4,9,8,3,2,7};
    int[][] comm = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

    System.out.println();
    t.solution(arr, comm);
  }
}
