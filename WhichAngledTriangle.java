import java.util.*;

public class WhichAngledTriangle
{
	public static void main(String[] args) 
        {
	     Scanner sc = new Scanner(System.in); 
             int a = sc.nextInt();
	     int b = sc.nextInt();
	     int c = sc.nextInt();
	     
	     if(a>b && a>c)
             {
	         if(2*a*a < a*a+b*b+c*c)
	         {
	             System.out.println(1);
	         }
	         else if(2*a*a > a*a+b*b+c*c)
	         {
	             System.out.println(3);
	         }
	         else
	         {
	             System.out.println(2);
	         }
	     }
	     else if(b>a && b>c)
             {
	         if(2*b*b < a*a+b*b+c*c)
                 {
	             System.out.println(1);
	         }
	         else if(2*b*b > a*a+b*b+c*c)
                 {
	             System.out.println(3);
	         }
	         else
                 {
	             System.out.println(2);
	         }
	     }
	     else if(c>a && c>b)
             {
	         if(2*c*c < a*a+b*b+c*c)
                 {
	             System.out.println(1);
	         }
	         else if(2*c*c > a*a+b*b+c*c)
                 {
	             System.out.println(3);
	         }
	         else
                 {
	             System.out.println(2);
	         }
	     }
	     else 
             {
	         if(2*c*c < a*a+b*b+c*c)
                 {
	             System.out.println(1);
	         }
	         else if(2*c*c > a*a+b*b+c*c)
                 {
	             System.out.println(3);
	         }
	         else
                 {
	             System.out.println(2);
	         }
	     }

        }	     
}