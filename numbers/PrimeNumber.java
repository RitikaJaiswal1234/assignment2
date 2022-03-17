package com.sebone.java.basic;

import java.util.Scanner;
/**Class Name:- PrimeNo
* Objective:-the class given no is prime or not
* @author :-Ritika jaiswal
* Date:-17-03-22
*/
public class PrimeNumber { //class PrimeNumber
	/**Method Name:-checkForPrime
	* Objective:-return the given no is prime or not
	* input : integer inputNumber
	* Date:-17-03-22
	*/
    public  boolean checkForPrime(int inputNumber) {
       for (int i = 2; i<= inputNumber/2; i++) {
         if (inputNumber % i == 0)
             return false;
     }
 
        	return true;
   }
	public static void main(String[] args) {
    boolean answer;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number :");
    int Number = sc.nextInt();
    PrimeNumber primeNumber=new PrimeNumber(); 
    answer = primeNumber.checkForPrime(Number);
    if(answer)
     System.out.println(Number+" is a prime number.");
    else
     System.out.println(Number+" is not a prime number.");
     sc.close();
}
}
