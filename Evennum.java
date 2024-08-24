/* print even numbers between 1 to N*/


import java.util.*;

public class Evennum  
{
	public static void main(String args[]) 
        {
		 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<=n;i+=2){
            if(i%2==0){
                System.out.print(i+" ");
            }      
        }
         
    }
}