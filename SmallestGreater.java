import java.util.*;

public class SmallestGreater {
    public static int[] SmallestGreaterElements(int[] arr) {
        // Write your code here
        int n = arr.length;
        // new Array to sort the original array.
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=arr[i];
        }
        // Bubble sort algorithm.
         for(int i=0; i<n; i++)
        {
            for(int j=0; j<n-1-i; j++)
            {
                if(a[j] > a[j+1])
                {
                    int temp =  a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;    
                }
            }   
        }
         
        // int count = 0;
        for(int i=0;i<n;i++){// This loop will iterate over original array.
              int count=0;
            for(int j=0;j<n;j++){// This loop will iterate over new array.
                if(a[j]>arr[i])
                {
                  count++;
                  arr[i]=a[j];
                  break;
                }
            }
            if(count==0)
            {
                arr[i]=-10000000;
            }
        }

        return arr;

    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SmallestGreaterElements(arr);
        for(int a : ans) {
            System.out.print(a + " ");
        }
    }
}