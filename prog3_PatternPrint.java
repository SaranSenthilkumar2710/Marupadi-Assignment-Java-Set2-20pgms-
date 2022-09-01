
package marupadi.Assignment2;

import java.util.Scanner;

public class prog3_PatternPrint {


   public static void main(String[] args) {
      // take input
      Scanner scan = new Scanner(System.in);
      int n = 0;
      System.out.print("Enter No of Rows to print half diamond Pattern : ");
      n = scan.nextInt();
 
      

      int place = 0;

      for(int i=1; i < 2*n; i++) {
         // after every iteration 
         // initialize a with 1

         if(i < n) place = i;
         else place = Math.abs(2*n-i);

         for(int j = 1; j <= 2*place-1; j++) {
            System.out.print("*"); 
         }

         // new line
         System.out.println();
      }
   }

}

