package com.basic.study;

import java.util.ArrayList;
import java.util.List;

public class Test {
  public int[] solution(int[] progresses, int[] speeds) {
    List<Integer> pList = new ArrayList<>();
    List<Integer> sList = new ArrayList<>();
    List<Integer> aLength = new ArrayList<>();
    int t = 0;
    int count = 0;

    // create progress arraylist
    for(int p=0; p<progresses.length; p++){
      pList.add(progresses[p]);
      sList.add(speeds[p]);
    }

    while(!pList.isEmpty()){
      if(pList.get(0) + t*sList.get(0) >= 100){
        count++;
        pList.remove(0);
        sList.remove(0);
      }else{
        if(count > 0){
          aLength.add(count);
          count = 0;
        }
        t++;
      }
    }
    aLength.add(count);
    int[] answer = new int[aLength.size()];
    for(int i=0; i<aLength.size(); i++){
      answer[i] = aLength.get(i);
    }
    return answer;
  }

  public static void main(String[] args) {
    int[] progresses = {93, 30, 55};
    int[] speeds = {1, 30, 5};
    Test t = new Test();
    t.solution(progresses, speeds);
  }

}