//Armstrong Number: the sum of cubes of each element of a given number.

import java.util.*;

public class ArmstrongNumber
{
     public static void main(String[] args)
     {
         Scanner sc = new Scanner(System.in); 
         System.out.println("Enter the Number: ");
         int n = sc.nextInt();
         int n2 = n;
 
         int sum =0;
         while(n>0) 
         {   
             int rem = n%10;
             sum+=rem*rem*rem;
             n=n/10;
         }
         if(sum==n2)
         { 
             System.out.println("The Number is a Armstrong Number"); 
         }
         else
         {
             System.out.println("The Number is not a Armstrong Number");
         }
          
     }
}