/* Reverse A Number
Write a java program to reverse the digits of an integer.

You've to display the digits of a number in reverse.
Take as input "n", the number for which digits have to be display in reverse.
Print the digits of the number line-wise, but in reverse order.
Input Format:"n" where n is any integer.*/

import java.util.*;
 
public class Rnp
{
     public static void main (String[] args) throws java.lang.Exception 
     {
		 
          Scanner sc = new Scanner(System.in);
          int n = sc.nextInt();
          int rem;
          int sum = 0;
           while(n>0)
           {
              rem = n%10;
              sum = rem;
              n=n/10;
              System.out.println(sum); /* it will print numbers in reverse order 
                                           with nextline.*/
           }
     }
}
