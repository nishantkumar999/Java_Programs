/*Power of a Number
Two numbers are entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java or C++ built-in function)

Input Format:The first line will contain two numbers a and b */

import java.util.*;

public class Powerloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
         
        int ans = 1;
        for(int i=1;i<=b;i++)  //loop for doing a*a*a*a----b times.
        {  
            ans = ans*a;
           
        }
        System.out.println("The power of number a raise to b is: "+ans);
    }

}