/* Sum of Digits
Given a number n. Your task is to find the sum of its digits using recursion.

**You have to complete sumDigit function which consists of single integer input n and returns the sum of its digits as integer output.*/


import java.util.Scanner;

public class SDF
{
    public static void main(String[] args) throws Throwable 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  
        int ans = sumDigit(n);
        System.out.println(ans);      
		sc.close();
    }

     public static int sumDigit(int n )
    {
         
        int sum = 0;
        while(n>0){
          int rem = n%10;
          sum+=rem;
           n=n/10; 
        }
      return sum;
    }
      
		
     
}