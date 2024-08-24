/*First and Last Digit
Given an integer N . Write a program to obtain the sum of the first and last digits of this number.*/

import java.util.*;

class firstlastdigSum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int ld = n%10;
		int rem = 0;
                int sum = 0;
		    
	        while(n>0){
		    rem = n%10;
		     n=n/10;
		          
	        }
		 sum = ld+rem;
		System.out.println(sum);
		 

	}
}
