package com.sebone.java.basic;
import java.util.Scanner;
   /**Method Name:-SumofNumber
   * Objective:- this class gives the Sum of given number 
   * @author :-Ritika jaiswal
   * Date:-17-03-22
   */
public class SumofNumb
   /**Method Name:-sumofdigit
   *Objective:-return the sum of given no
   * input : integer number 
   * Date:-17-03-22
   */
public int sumofdigit(int number) {
  int  i, sum = 0;
 for(i = 1; i <= number; i++)
     sum = sum + i; 
      return sum;
}
public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  System.out.print(" Please Enter any Number : "); 
  int number = scanner.nextInt();	
  SumofNumber sumofnumber = new SumofNumber();
  int answer=sumofnumber.sumofdigit(number);
  System.out.println(" The Sum of Natural Numbers from 1 to "+ number + " = " + answer);
  scanner.close();
  }
}
