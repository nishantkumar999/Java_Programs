import java.io.*;
import java.util.*;

class IcecreamParlour{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int M=sc.nextInt();
        int cost[]=new int[N];
        for(int i=0;i<N;i++)
        {
            cost[i]=sc.nextInt();
        }

        Solution obj=new Solution();
        obj.solve(cost,N,M);
        
    }
}


class Solution{
    static void solve(int cost[],int N,int M)
    {
        // your code here
        int firstFlavour = -1, secondFlavour = -1;
        outerloop:
        for(int i=0; i<N-1; i++){
            for(int j=i+1; j<N; j++){
                if(cost[i] + cost[j] == M){
                    firstFlavour = i+1;
                    secondFlavour = j+1;
                    break outerloop;   
                }
            }
        }
        System.out.println(firstFlavour + " " + secondFlavour);
        
    }
}