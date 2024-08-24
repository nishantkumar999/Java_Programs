import java.util.*;

public class Pairs
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int count = 0;
        for(int i=0; i<arr.length-1; i++){
               int  sum = arr[i] + arr[i+1];
               
                if( sum == k ){
                    count++;
            }
        }
        System.out.println(count);
           
	}
}