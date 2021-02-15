package com.basic.day3;

import java.util.Arrays;

public class ArrayCopyExam {
  public static void main(String[] args) {
    int[] oldIntArray = {1,2,3};
    int[] newIntArray = new int[5];

    for(int i=0; i <oldIntArray.length; i++) {
      newIntArray[i] = oldIntArray[i];
    }

    for(int i=0; i <newIntArray.length; i++) {
      System.out.print(newIntArray[i] + ",");
    }
    System.out.println();
    System.out.println(oldIntArray.equals(newIntArray));
    System.out.println(oldIntArray == newIntArray);
    System.out.println();

    String[] oldStrArray = {"kim","Lee","Park"};
    String[] newStrArray = {"kim","heo","kang","Choi","Jung"};

    System.arraycopy(oldStrArray, 0, newStrArray, 0, oldStrArray.length);

    for(int i=0; i <newStrArray.length; i++) {
      System.out.print(newStrArray[i] + ",");
    }
    System.out.println();
    System.out.println(oldStrArray == newStrArray);
    System.out.println();

    String[] oldStrArray1 = {"kim","Lee","Park"};
    String[] newStrArray1 = Arrays.copyOf(oldStrArray1, oldStrArray1.length);
    for(int i=0; i <newStrArray1.length; i++) {
      System.out.print(newStrArray1[i] + ",");
    }
    System.out.println();
    System.out.println(oldStrArray1.equals(newStrArray1));
    System.out.println(oldStrArray1 == newStrArray1);

    String[] oldStrArray2 = {"kim","Lee","Park"};

    String[] newStrArray2 = oldStrArray.clone();

    for(int i=0; i <newStrArray2.length; i++) {
      System.out.print(newStrArray2[i] + ",");
    }
    System.out.println();
    System.out.println(oldStrArray2.equals(newStrArray2));
    System.out.println(oldStrArray2 == newStrArray2);

  }
}
