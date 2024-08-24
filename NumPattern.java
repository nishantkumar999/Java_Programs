/*     1
      123
     12345
    1234567
   123456789   full pyramid Pattern print with n natural numbers. */


import java.util.*;

public class NumPattern
{
    public static void main(String[] args) 
    {   Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) 
        {
            for (int j = 1; j <= n - i; ++j) 
            {
                System.out.print(" "); // Print spaces
            
            for (int j = 1; j <= 2 * i - 1; ++j) 
            {
                System.out.print(j); // Print numbers
              //System.out.print(j+" ");/*print space between numbers also with                                                number*/
            }
                  
           System.out.println(); // Move to the next line
        }
    }
}
