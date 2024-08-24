import java.util.*;
 
public class ReferenceArray
{
	public static void main (String[] args) throws java.lang.Exception
	{
		//your code here
             //Scanner sc = new Scanner(System.in);
             int arr[] = {3, 4, 8, 10};
             
        }

        public static void modify(int arr[], int n){
             arr[0] = 10;
             b = 11;
             System.out.println(arr[0]);

             
        }
        
         int first = 0;
         int second = 1;
         int c = first + second;

         for(int i=2; i<=n; i++){
             c = first + second;
             first = second;
             second = c;
           
         }
       System.out.print(c);
         
	
}