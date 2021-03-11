package com.basic.study;

public class Test3{
  public int[] solution(int[] answers) {
    int[] answer = {};
    int[] first = new int[answers.length];
    int[] second = new int[answers.length];
    int[] third = new int[answers.length];
    int countF=0;
    int countS=0;
    int countT=0;
    for(int i=0; i<answers.length; i++) {
      if(i < 5) {first[i]= i+1;} else {first[i] = (i%5)+1;}
      if(i%2==0) {second[i] = 2;}
      if(i%8 == 1) {second[i] = 1;}
      if(i%8 == 3) {second[i] = 3;}
      if(i%8 == 5) {second[i] = 4;}
      else if(i%8 == 7) {second[i] = 5;}
      if(i%10 ==0 || i%10 ==1) {third[i]=3;}
      if(i%10 ==2 || i%10 ==3) {third[i]=1;}
      if(i%10 ==4 || i%10 ==5) {third[i]=2;}
      if(i%10 ==6 || i%10 ==7) {third[i]=4;}
      if(i%10 ==8 || i%10 ==9) {third[i]=5;}
    }
    for (int i=0;i<answers.length; i++) {
      if(answers[i] == first[i]) countF++;
      if(answers[i] == second[i]) countS++;
      if(answers[i] == third[i]) countT++;
    }
    if(countF == countS && countS == countT) answer = new int[] {1,2,3};
    if(countF == countS && countS > countT) answer = new int[] {1,2};
    if(countF < countS && countS == countT) answer = new int[] {2,3};
    if(countF==countT && countS < countT) answer = new int[] {1,3};
    if(countF > countS && countF > countT) answer = new int[] {1};
    if(countF < countS && countS > countT) answer = new int[] {2};
    if(countF < countT && countS < countT) answer = new int[] {3};

    return answer;
  }
  public static void main(String[] args) {
    Test3 t = new Test3();
    int[] answers = {1,2,3,2,4,5,3,2,2,1,4,3,1,2,4,5,2,3,4,1,2,3};
    System.out.println(t.solution(answers));
  }
}