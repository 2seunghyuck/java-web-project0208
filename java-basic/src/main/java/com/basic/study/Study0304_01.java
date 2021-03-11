package com.basic.study;

import java.util.Arrays;

public class Study0304_01 {
  public int[] solution(int[] array, int[][] commands) {
    int[] answer= new int[commands.length];
    for(int i=0; i<commands.length;i++) {
      int[] tmp = new int[commands[i][1]-commands[i][0] +1];
      for(int j = 0; j<commands[i][1]-commands[i][0] +1;j++) {
        tmp[j] = array[(commands[i][0]-1)+j];
      }
      Arrays.sort(tmp);
      answer[i] = tmp[commands[i][2]-1];
    }

    for(int i: answer) {
      System.out.println(i);
    }
    return answer;
  }
}

// 위에서 소팅을 바로하려 했는데 , 포문안에서 소팅을하면 commands의 두번째 배열이 돌때 소팅 된채로 돌기 때문에
// 결과 값이 제대로 나오지 않으므로 for 문안에서arr 를 매번 초기화 해주기 위해 간단하게 복제 해서 문제를 해결
