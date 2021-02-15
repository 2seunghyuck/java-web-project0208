package com.basic.day3;

import java.util.Scanner;

public class AlphabetExam {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String alp ;
    int countJ =0 ;
    int countM =0 ;
    System.out.println("영단어를 입력하세요");
    alp = sc.nextLine();
    for(int i =0; i <alp.length(); i++) {
      switch(alp.charAt(i)) {
        case 'a' : countM++; break;
        case 'e' : countM++; break;
        case 'i' : countM++; break;
        case 'o' : countM++; break;
        case 'u' : countM++; break;
        case 'A' : countM++; break;
        case 'E' : countM++; break;
        case 'I' : countM++; break;
        case 'O' : countM++; break;
        case 'U' : countM++; break;
        default : countJ++; break;
      }
    }
    System.out.println("모음의 갯수" + countM);
    System.out.println("자음의 갯수" + countJ);

    //    for(int i =0; i <alp.length(); i++) {
    //      if (alp.charAt(i) == 'a' || alp.charAt(i) == 'e' || alp.charAt(i) == 'i' || alp.charAt(i) == 'o' || alp.charAt(i) == 'u'
    //          || alp.charAt(i) == 'A' || alp.charAt(i) == 'E' || alp.charAt(i) == 'I' || alp.charAt(i) == 'O' || alp.charAt(i) == 'U')
    //        countM++;
    //      else countJ++;
    //    }

  }
}
