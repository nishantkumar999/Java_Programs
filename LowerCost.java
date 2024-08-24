import java.util.*;

class LowerCost
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int X1 = sc.nextInt();
		    int Y1 = sc.nextInt();
		    int X2 = sc.nextInt();
		    int Y2 = sc.nextInt();
		    
		    int s = X1 + Y1;
		    int e = X2 + Y2;
                    System.out.println("Print the Lowest Cost: ");
		    if(s>e){
		        System.out.println(e);
		    }
		    if(s<e){
		        System.out.println(s);
		    }
		    if(s==e){
		        System.out.println(s);
		    }
		     
		}

	}
}