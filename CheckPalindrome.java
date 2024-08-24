/* Palindrome Checker: Verifying if a Number Reads the Same Backwards and Forwards
Given an integer x, return true if x is a palindrome, and false otherwise.

A palindromic number (also known as a numeral palindrome or a numeric palindrome) is a number (such as 16461) that remains the same when its digits are reversed. In other words, it has reflectional symmetry across a vertical axis.

Input Format:An integer value*/

import java.util.*;

public class CheckPalindrome
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int reversedNum = 0, rem;
    
    // store the number to originalNum
    int originalNum = num;
    if(num<0){
        System.out.println("false");
    }
    else{
        
        // get the reverse of originalNum
        // store it in variable
         while (num != 0){
         rem = num % 10;
         reversedNum = reversedNum * 10 + rem;
         num /= 10;
         }
    
        // check if reversedNum and originalNum are equal
        if (originalNum == reversedNum){
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }
    }

  }
  
}