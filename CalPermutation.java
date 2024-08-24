//Calculate Permutation.

import java.util.*;

public class CalPermutation
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter value of n: ");
         int n = sc.nextInt();
         System.out.println("Enter value of r: ");
         int r = sc.nextInt();
       
         System.out.println("Value of npr is: " + npr(n, r));     
    }

     // Function to Calculate Factorial of a Number.
    public static int factorial(int num)
    {
         if(num<=1)
         { 
             return 1;   
         }
           return num * factorial(num-1);
    }
       
      //Function to Calculate npr.
    public static int npr(int n ,int r)
    {
        return factorial(n)/factorial(n-r); 
        
             /* int fact = 1;
       for(int i=1;i<=n;i++){
            fact1 = fact*i;
       }
       
       for(int j=1;j<=n-r;j++){
            fact2 = fact*j;
       }
        return (int)fact1/fact2;*/
    }
}