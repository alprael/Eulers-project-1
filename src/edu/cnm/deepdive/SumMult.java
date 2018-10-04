package edu.cnm.deepdive;

public class SumMult {


  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    while (i <= 1000) {
      i++;
      sum = sum + i;
      if ((i % 3 == 0) && (i % 5 == 0)){
        int mult = sum - i;
        if (i % 3 == 0){
          int t = mult - i;
          if (i % 5 == 0) {
            int x = t - i;
            int v = sum - x;
            System.out.println(v + " " + "is the summation of all the multiples of 3 and 5 below 1000");
          }
        }
      }
    }
  }
}

