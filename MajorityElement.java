import java.util.*;

class Solution {
    public void majorityElement(int[] arr,int n) {
         
        int max_Count = 0;
        int index = -1;
        for(int i=0; i<n; i++){
            int count = 1;
            for(int j=i+1; j<n; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }

            if(count > max_Count){
                max_Count = count;
                index = i;
            }
        }
        if(max_Count > n/2){
            System.out.print(arr[index]);
        }
    }
}

public class MajorityElement{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.majorityElement(arr,n);
        sc.close();
    }
}