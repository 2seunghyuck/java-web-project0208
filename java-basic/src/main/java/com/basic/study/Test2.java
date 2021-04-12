package com.basic.study;

import java.util.LinkedList;
import java.util.Queue;

public class Test2{
  public int solution(int bridge_length, int weight, int[] truck_weights) {
    int answer = bridge_length;
    int bridgeWeight = 0;
    Queue<Integer> status = new LinkedList<>();

    for(int truck : truck_weights)
    {
      if(status.isEmpty()){
        status.offer(truck);
        answer++;
        bridgeWeight+=truck;
        break;
      }else if(status.size() == bridge_length){
        bridgeWeight-=status.poll();
      }else if(bridgeWeight + truck <= weight){
        status.offer(truck);
        answer++;
        bridgeWeight+=truck;
        break;
      }else{
        status.offer(0);
        answer++;
      }
    }
    return answer;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();

    int bridge_length = 100;
    int weight = 100;
    int[] truck_weights = {10,10,10,10,10,10,10,10,10,10};

    t.solution(bridge_length, weight, truck_weights);
  }
}