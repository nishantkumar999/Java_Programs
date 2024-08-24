/*Palindromes in given range*/


import java.util.*;

public class RangePalindromeNumber 
{

    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int range1, range2;
        System.out.println("Enter a range in numbers:");
        range1 = sc.nextInt();
        range2 = sc.nextInt();
        int copy = 0;
        int rev = 0;
        System.out.println(range1 + " to " + range2 + " palindrome numbers are");
        for (int i = range1; i <= range2; i++) 
        {
            copy = i;
            rev = 0;
            while (copy != 0) 
            {    
                 // Code block to Reverse the digits of a Number.
                int rem = copy % 10;
                copy /= 10;
                rev = rev * 10 + rem;
            }
               
             //To Check If Original number i is equal to Reverse Number.
            if (i == rev)
                System.out.print(i + " ");
        }
         
    }
}