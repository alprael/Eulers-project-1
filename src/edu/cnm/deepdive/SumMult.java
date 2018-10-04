package edu.cnm.deepdive;

public class SumMult {


  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    while (i <= 1000) {
      sum = sum + i;
      i++;
      System.out.println(sum);
      if ((i % 3 == 0) || (i % 5 == 0)) {
        sum = sum - i;
        System.out.println(sum);
        
      }
    }
  }
}


