package com.basic.study;

import java.util.ArrayList;
import java.util.List;

public class Test2{
  public int solution(int[] nums) {

    List<Integer> list = new ArrayList<>();
    int num =0;
    for(int i=0; i<nums.length; i++) {
      for(int j=i+1; j< nums.length; j++) {
        for(int k=j+1; k<nums.length; k++) {
          num = nums[i]+nums[j]+nums[k];
          list.add(num);
        }
      }
    }
    int result = 0;

    for(int sosu : list) {
      int count =0;
      for(int i=1; i <= sosu; i++) {
        if (sosu % i == 0) count++;
      }
      if(count == 2) result++;
    }
    return result;
  }

  public static void main(String[] args) {
    Test2 t = new Test2();
    int[] nums = {1,2,7,6,4,9,30,44};
    System.out.println(t.solution(nums));
  }
}