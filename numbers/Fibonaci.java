
package com.sebone.java.basic;
import java.util.Scanner;
public class Fibonaci
{
  public int Fibonacinumber(int num) 
  {
	  int n, first = 0,next = 1;
	  for (int i = 1; i<=num-2; ++i)
      {
          int sum = first + next;
          first = next;
          next = sum;
          System.out.print(" " + sum);
      }
     return 0;
	  
  }
    public static void main(String[] args) 
    {
    
          
            System.out.println("Enter how may fibonnaci numbers to print");
            Scanner scanner = new Scanner(System.in);
            int number = scanner.nextInt();
            Fibonaci fibNo=new  Fibonaci ();
            int answer=fibNo.Fibonacinumber(number);
            System.out.println("the fibonaci series of given no is = "+answer);
            
           
  
    }
  
}


