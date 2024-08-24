import java.util.*;

public class Assessment 
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int thres = sc.nextInt();

        for(int i=0; i<arr.length; i++){
            if(arr[i]>thres){
                System.out.print(" pass");
            }
            else{
                System.out.print(" fail");
            }
        }
	}
}
