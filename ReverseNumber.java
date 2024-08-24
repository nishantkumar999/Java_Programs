//Program to reverse the number.

import java.util.*;

public class ReverseNumber
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the number: ");
         int n = sc.nextInt();

         int sum=0;
         int rem;
         
         while(n > 0){
            rem = n % 10;
            sum= rem;
            n /= 10;
            System.out.print(sum);      
         }
              
    }

}