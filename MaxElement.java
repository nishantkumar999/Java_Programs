import java.util.*;

public class MaxElement
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
       

        int max = Integer.MAX_VALUE;
        for(int i=0; i<n;i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
         System.out.print(sum+" "+avg+" "+min);
         
	}
}




 