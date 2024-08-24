import java.util.*;

public class BubbleSort
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }         

   // System.out.println(arr[i] +" " );        

        // int arr[] = {13, 17, 2, 5, 11, 9};
        // int n = arr.length;

        for(int i=0; i<n; i++){
            boolean swapped = false;
            for(int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            //When array is already sorted, there will be no swaps.
            if(swapped == false){
                break;
            }
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}