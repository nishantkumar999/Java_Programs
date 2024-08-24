/*First and Last Digit
Given an integer N . Write a program to obtain the sum of the first and last digits of this number.*/

//This can be solved by String and char data types.

import java.util.*;

class Sumfl
{ 	public static void main (String[] args) throws java.lang.Exception
	{
        char[] numbers;
        int sum;
        Scanner scanner = new Scanner(System.in);
        
            numbers = String.valueOf(scanner.nextInt()).toCharArray();
            sum = 0;
            sum += numbers[0] - '0';
            sum += numbers[numbers.length - 1] - '0';
            System.out.println(sum);
        }
        
	 
}

