import java.util.*;

class Solution {

    public void rightRotate(int[] arr, int n, int k) {
        // write code here
        k = k%n;
        for(int i=0; i<n; i++){
            if(i<k){
                // Print rightmost element.
                System.out.print(arr[n+i-k] + " ");
            }
            else{
                System.out.print(arr[i-k] + " ");
            }
        }
        // System.out.println();
    }
}

public class RightRotateByKtimes {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        Obj.rightRotate(arr, n, k);
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
    }
}