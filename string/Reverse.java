package com.sebone.java.basic;

import java.util.Scanner;
 /**Class Name:- Reverse
 * Objective:-the class gives the reverse of string
 * @author :-Ritika jaiswal
 * Date:-17-03-22
 */
public class Reverse {
 /**
 * Method Name : reversestring
 * Objective : return the reverse string
 * input : String input
 * return : returns integer as count
 * Date : 17/03/2022
 */ 
public String reversestring (String input ) {
   String dummy ="";
   for(int i=input.length()-1;i>=0;i--) {
    dummy=dummy+input.charAt(i);
   }
 return dummy;
 }// reverse method close
public static void main(String[] args) {
    Scanner scanner = new  Scanner(System.in);
    System.out.println("Enter a String to be reversed");
    String input=scanner.nextLine();
    Reverse str=new  Reverse();
    System.out.println("Reverse string is = "+str.reversestring(input));
    scanner.close();
}// main method close
}// class close


