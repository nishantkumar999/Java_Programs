//Program to Print Character Pattern.

import java.util.*;

public class CharPattern
{
    public static void main(String[] args)
    { 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number for pattern print: ");
        int n = sc.nextInt();

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print("A");
            }
            System.out.println();
        }  
    } 
}