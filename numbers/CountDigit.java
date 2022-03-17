package com.sebone.java.basic;



import java.util.Scanner;
/**
* Class Name : CountDigit
* Objective : This class gives the number of digits present in given input
* @author : Ritika jaiswal
* Date : 17/03/2022
*/
public class CountDigit {
	/**
     * Method Name : countofDigit
     * Objective : count digits of number given by user
     * input : integer number
     * return : returns integer as count
     * Date : 17/03/2022
    */  


	public int countofDigit(int number) {
		int count=0;
		while(number>0){
			number/=10;
			count++;
		}
		return count;
    }
			 
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int number = scanner.nextInt();
        CountDigit countDigit=new CountDigit();
        int answer=countDigit.countofDigit(number);
        System.out.println("count of a given number is = "+answer);
        scanner.close();
	}

}
