package com.basic.study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {
  public int[] solution(int N, int[] stages) {
    int[] answer = new int[N];
    List<Integer> list = new ArrayList<>();
    float[] count = new float[N];
    int tmp = stages.length;

    for(int i=0; i<N; i++) {
      answer[i] = i+1;
      count[i] =0;
      list.add(i+1);
    }
    Arrays.sort(stages);

    for(int i=0; i<stages.length; i++) {
      if(list.contains(stages[i])) count[stages[i]-1]++;
    }
    for(int i=0; i<count.length; i++) {
      tmp -= count[i];
      count[i] = count[i]/(tmp+count[i]);
      System.out.println(tmp);
    }

    float rankA =0;
    int rankB =0;
    int eq =0;

    for(int i=0; i<count.length; i++) {
      for(int j=i; j<count.length; j++) {
        if(count[i]>count[j]) continue;
        else if(count[i]<count[j]) {
          rankA = count[i];
          count[i] = count[j];
          count[j] = rankA;
          rankB = answer[i];
          answer[i] = answer[j];
          answer[j] = rankB;
        }
        else if(count[i]==count[j]) {
        }
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    //    if(answer[i]>answer[j]) {
    //      eq = answer[j];
    //      answer[j] = answer[i];
    //      answer[i] = eq;
    //    }
    Test t = new Test();
    int N = 5;
    int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};

    System.out.println(t.solution(N, stages));
  }
}