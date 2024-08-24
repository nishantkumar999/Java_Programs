import java.util.*;
 
class  SecLargest
{
      public static void main (String[] args) throws java.lang.Exception
      {
		 
		Scanner sc = new Scanner(System.in);
                System.out.println("Enter Number of Test cases: ");
		int n = sc.nextInt();
		
	    for(int i=0;i<n;i++)
	    {    
                System.out.println("Enter Values: ");
	        int a = sc.nextInt();    
	        int b = sc.nextInt();
	        int c = sc.nextInt();
	    
	        if(a<b && a>c || a>b && a<c)
	        {
	           System.out.println(a); 
	        } 
	        else if(b<a && b>c || b>a && b<c)
	        {
	           System.out.println(b); 
	        }
	        else
	        {
               System.out.println(c);	        
	        }
	    }
      }
}