package com.sebone.java.basic;
import java.util.Scanner;
/**Class Name:- FactorialNo
* Objective:-the class gives the factorial of given no
* @author :-Ritika jaiswal
* Date:-17-03-22
*/

public class FactorialNumber {
	/**Method Name:-Factorialofgivennumber
	 * Objective:-return the factorial of given no
	 * input : integer number
     * Date:-17-03-22
	 */
	public int Factorialofgivennumber(int number) {
	    int factorial = 1;
		for(int i = 1; i <= number; i++) 
			factorial = factorial * i; 
	    return factorial;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter any Number : ");
		int number = scanner.nextInt();	
		FactorialNumber factorialNo = new FactorialNumber();
		int answer= factorialNo.Factorialofgivennumber(number);
		System.out.println("The factorial of given no is = " +answer);
		scanner.close();
	}
}

