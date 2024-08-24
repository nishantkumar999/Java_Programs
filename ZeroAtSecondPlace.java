/*int one=(n/1)%10;
  int tens=(n/10)%10;
  int hundred = (n/100)%10;
 Place Value Checker:
Given a positive integer N. The task is to Create a function and return true or false according to the condition that whether zero is present at the second last place value or not.*/


import java.util.*;

public class ZeroAtSecondPlace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

    public static boolean determineSecondLastDigit(int n) {
        // write code here
        int tens = (n/10)%10;
        if(tens == 0){
            return true;
        }
        
            return false;
        
    }
}