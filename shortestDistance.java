import java.util.*;
import java.lang.*;
import java.io.*;

public class shortestDistance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        
        int minDist = Integer.MAX_VAlUE;
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
               int num1 = arr[i];
               int num2 = arr[j];
                if((num1 >0 && num1 % 2==0) && (num2 >0 && num2 % 2==0)){
                    int dist = Math.abs(num1 - num2);
                }
            }
        }

        if(minDist == Integer.MAX_VALUE){
            System.out.println(-1);
        }
        else{
           System.out.println(minDist);
            
        }
	}
}