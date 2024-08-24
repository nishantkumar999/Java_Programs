import java.util.*;

class AtmCash
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
		Scanner sc = new Scanner(System.in);
		float x = sc.nextFloat();
		float y = sc.nextFloat();
                
                if(x%5==0 && x+0.50<=y)
                y = y-x-0.50f;
                System.out.printf("%.2f",y);
                   
                
		
/*           if(y>x){
    	         if(x%5==0){
    	             if(y>=(x+0.50)){
    	                 System.out.println(y-(x+0.50));
    	             }
    	             else{
    	                 System.out.println(y);
    	             }
    	         }
    	         else{
    	             System.out.println(y);
    	         }
	     }
	     else{
		  System.out.println(y);
             }*/

	}
}