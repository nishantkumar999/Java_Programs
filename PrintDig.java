/* Print Digits
Given the number n, print its digits starting from most significant digit to least significant digit.

Input Format:Input consists of single line which has the integer n.

Output Format:print the digits of number one line at a time.*/

import java.util.*;

public class PrintDig {
    public static void main(String[] args) {

        // Write your code here
	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        int t=n;
        
        //to reverse the number
        int rev=0;
        for(;t!=0;){
            int dig = t%10;
            rev = rev*10+dig;
            t=t/10;
        }

        //to print the digits
        for(;rev!=0;){
            int dig = rev%10;
            System.out.println(dig);
            rev=rev/10;
            
        }

        //to count trailing zeroes.
        t=n;
        int count = 0;
        for(;t!=0;){
            int dig = t%10;
            if(dig==0){
                count = count+1;
            }
            else{
                break;
            }
            t=t/10;
         }
         
      //for adding trailing zeroes during print of a number have trailing zeroes.
        for(int i=1;i<=count;i++){
            System.out.println(0);
        }
    }
}