/* Check Prime : to print whether the given number is prime or not*/

import java.util.*;

public class PrimeCount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        int count=0;
         // Run a loop from 2 to n-1.
        for(int i=2;i<=n-1;i++)
        {
            //count the prime numbers here. 
             
            if(n%i==0)
            {
                count++;
                break;
            }
        
        } 
            if(count==0)
            { 
                System.out.println(n+" is a Prime number");            
            }
            else
            {
                System.out.println(n+" is not Prime Number");
            }
        
    }
}