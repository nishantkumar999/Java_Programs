import java.util.*;

public class Buildings.java
{
	public static void main (String[] args) throws java.lang.Exception
	{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
          // To calculate maxfloor in building
        int maxFloor = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > maxFloor){
                maxFloor = a[i];
            }
        }

        // To print Star for building
        for(int i=maxFloor; i<0; i++){
            for(int j=0; j<n; j++){
                if(arr[j] >= i){
                    System.out.print("*");
                }
            System.out.print("\t");
            }
            System.out.println();
        }
           
	}
}