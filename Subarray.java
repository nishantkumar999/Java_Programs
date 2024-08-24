import java.util.*;
 
public class Subarray
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


        //To print Subarray of array.
        for(int i=0; i<arr.length; i++){
            for(int j=i; j<n; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(arr[k] + " ");
                }
                System.out.println();
            }
             
        }
         

        
        
           
	}
}