/* Accepts an integer (n) and computes the value of n + nn + nnn
Write a Java program that accepts an integer (n) and computes the value as n + nn + nnn

Input Format
An integer value.

Output Format
computes the value as n + nn + nnn*/

import java.util.*;
 
public class Compute
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            System.out.printf("%d + %d%d + %d%d%d\n",n,n,n,n,n,n);
//          System.out.println(n+" "+"+"+" "+n+""+n+" "+"+"+" "+n+""+n+""+n);
	}
}