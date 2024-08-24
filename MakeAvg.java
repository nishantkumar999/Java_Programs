import java.util.Scanner;

class MakeAvg
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
            System.out.println("Enter the number of cases t: ");
	    int t = read.nextInt();
	    for(int i=0; i<t; i++)
            {
                System.out.println("Enter the number A: ");
	        int A = read.nextInt();
                System.out.println("Enter the number C: ");
	        int C = read.nextInt();
	        // Use your sub-components below this line to solve the problem
	        if(A%2==0 && C%2==0)
	        {
	           int B=(A+C)/2; 
	           System.out.println("Avg of A and C is " +B);
	        }
	        else if (A%2!=0 && C%2!=0)
	        {
	            int B=(A+C)/2;
	            System.out.println("Avg of A and C is " +B);
	        }
	        else
	        {
	            System.out.println(-1);
	        }
	        
	    }
	}
}