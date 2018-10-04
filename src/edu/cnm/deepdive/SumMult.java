package edu.cnm.deepdive;

public class SumMult {


  public static void main(String[] args) {
    int sum = 0;
    int i = 1;
    while (i <= 1000) {
      i++;
      sum = (sum + i);
      if ((i % 3 == 0) && (i % 5 == 0)){
        int mult = sum - i;
        if (i % 3 == 0){
          int t = mult - i;
          if (i % 5 == 0) {
            int x = t - i;
            System.out.println(x - 1);
          }
        }
      }
    }
  }
}

