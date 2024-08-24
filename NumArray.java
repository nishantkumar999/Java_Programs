//Progarm to check Smallest Number in an array.

import java.util.*;

public class NumArray
{
    public static void main(String[] args)
    {
         Scanner sc = new Scanner(System.in);
         
         int n = sc.nextInt();
         
         int arr[] = new int[n];   
         System.out.println("Enter the elements of array: ");
         
         for(int i=0;i<n;i++)
         {
             arr[i] = sc.nextInt();      
         }  

         /*Assuming first element is smallest*/
         int min=arr[0];
         for(int i=0;i<n;i++)
         {
               if(arr[i]<min)
               {
                  min=arr[i];
               }
         }
      System.out.println("The Smallest element in this array is: "+min);
    }
     
}