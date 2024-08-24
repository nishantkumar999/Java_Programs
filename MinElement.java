import java.util.*;
 

public class MinElement
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
         
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += arr[i];
        }
       

        int avg = sum/n;
      

        int min = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i] > min){
                min = arr[i];
            }
        }
         System.out.print(sum+" "+avg+" "+min);
         
	}
}