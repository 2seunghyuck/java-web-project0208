package com.basic.study;

import java.util.ArrayList;
import java.util.List;

public class Test3{
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    int[] list = new int[moves.length];
    List<Integer> al = new ArrayList<>();
    boolean cnt = true;
    for(int i=0; i<moves.length; i++) {
      for(int j=0; j<board.length; j++) {
        if (board[j][moves[i]-1] > 0 && board[j][moves[i]-1] !=0) {
          list[i] = board[j][moves[i]-1];
          board[j][moves[i]-1] = -1;
          break;
        } else if (board[j][moves[i]-1] == -1) {
          list[i] = 0;
        }
      }
    }
    for(int i : list) {
      System.out.println("list" + i);
      al.add(i);
    }
    for(int i : al) {
      System.out.println("before" + i);
    }
    boolean s = true;
    while(s) {
      for(int i =0; i<al.size()-2; i++) {
        if(al.get(i) ==0)  {
          al.remove(i);
        }
        else if(al.get(i) == al.get(i+1)) {
          al.remove(i);
          al.remove(i);
          answer += 2;
        } else s = false;
      }
    }
    for(int i: al) {
      System.out.println("after" + i);
    }
    System.out.println(answer);
    return answer;
  }
  public static void main(String[] args) {
    Test3 t = new Test3();
    int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
    int [] moves = {1,5,3,5,1,2,1,4};
    t.solution(board, moves);
  }
}