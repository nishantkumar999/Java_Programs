/*Print Continuous Character Pattern
Given an integer n that denotes the number of rows to be printed, print the pattern in which each row starts with its corresponding alphabet and has a length equal to the row number.

Note: You can take the alphabet to be cyclic. On reaching Z, you will cycle back to A, then B, and so on.*/
import java.util.*;

public class Chpattern 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        char ch = 'A';
        for(int i=0;i<n;i++)
        {
             for(int j=0;j<=i;j++)
             {
                 System.out.print(ch);
                 ch = (char)(ch + 1);
                 if(ch > 'Z')
                 {
                     ch = 'A';  
                 }
                
             }
              
           System.out.println();
            ch = (char)('A' + i + 1);
        }
    }
}