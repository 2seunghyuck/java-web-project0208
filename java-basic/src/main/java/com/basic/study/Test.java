package com.basic.study;

public class Test {
  public String solution(int[] numbers, String hand) {

    StringBuffer sb = new StringBuffer();
    int leftIndex = 10;
    int rightIndex = 12;

    for(int i : numbers) {
      int num = i==0?11:i;

      if(num == 1 || num == 4 || num == 7) {
        sb.append("L");
        leftIndex = num;
      } else if(num == 3 || num == 6 || num == 9) {
        sb.append("R");
        rightIndex = num;
      } else {
        int leftLength = Math.abs((leftIndex-1)/3-(num-1)/3) ;
        leftLength +=  (leftIndex-num)%3==0?0:1;
        int rightLength = Math.abs((rightIndex-2)/3-(num-1)/3) ;
        rightLength += (rightIndex-num)%3==0?0:1;

        if(leftLength > rightLength) {
          sb.append("R");
          rightIndex = num;
        } else if(leftLength < rightLength) {
          sb.append("L");
          leftIndex = num;
        } else {
          if(hand.equals("right")) {
            sb.append("R");
            rightIndex = num;
          } else {
            sb.append("L");
            leftIndex = num;
          }
        }
      }
    }

    return sb.toString();
  }

  public static void main(String[] args) {
    Test t = new Test();
    int[] numbers = {1,2,4,6,2,8,4,3,7,3};
    String hand = "right";
    System.out.println(t.solution(numbers, hand));
  }
}