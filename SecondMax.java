/* Find Second Largest Element in an Array*/
import java.util.*;

public class SecondMax
{
	public static void main (String[] args) throws java.lang.Exception
	 {
		//your code here
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

         int max = Integer.MIN_VALUE;
         int maxInd = -1;
         for(int i=0; i<arr.length; i++){
             if(arr[i] > max){
                 max = arr[i];
                 maxInd = i;
             }
         }

         int secondMax = Integer.MIN_VALUE;
         int secondMaxInd = -1;
         for(int i=0; i<arr.length; i++){
             if(arr[i] > secondMax && max != arr[i]){
                 secondMax = arr[i];
                 secondMaxInd = i;
             }
         }
         
        
        System.out.println(max+" "+maxInd);
        System.out.println(secondMax+" "+secondMaxInd);
         
	}
}