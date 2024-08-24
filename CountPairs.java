// A sorting based Java program to 
// count pairs with difference k

import java.io.*;
import java.util.*;

class Solution {
    public int Pairs(int []arr,int k){
        int count = 0;
           for(int i=0; i<arr.length-1; i++){
               for(int j=i+1; j<arr.length; j++){
                        if(arr[i] - arr[j] == k || arr[j] - arr[i] == k){
                            count++;
                        }
                }      
            }
        return count;
        
    }
}

public class CountPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;++i){
                arr[i]=sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.Pairs(arr,k)); 
    }
}