/* Add two binary numbers
Write a Java program to add two binary numbers.

In digital electronics and mathematics, a binary number is a number expressed in the base-2 numeral system or binary numeral system. This system uses only two symbols: typically 1 (one) and 0 (zero).

Input Format:Two binary numbers*/

import java.util.*;
 
public class Addbin
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        int number0 = Integer.parseInt(s1, 2);
        int number1 = Integer.parseInt(s2, 2);

        int sum = number0 + number1;
        String s3 = Integer.toBinaryString(sum);
        System.out.println(s3);

	}
}