/* Which angled triangle
Given the 3 sides of a triangle, find out whether it is acute-angled, right-angled, or obtuse-angled.

You need to output 1 for acute, 2 for right-angled, and 3 for an obtuse-angled triangle. You can assume that the input values always form a triangle and are valid integers.

Note:

A triangle is acute-angled, if the square of the largest side is less than the sum of squares of other two sides.

A triangle is obtuse-angled, if the square of its largest side is greater than the sum of squares of other two sides.

A triangle is right-angled, if the square of its largest side is exactly equal to the sum of squares of other two sides.*/
 
import java.util.*;

class Compare 
{
    
    static int triangle(int a, int b, int c)
    {
             
        if(a>b && a>c){
	         if(2*a*a < a*a+b*b+c*c)
	         {
	              return 1;
	         }
	         else if(2*a*a > a*a+b*b+c*c)
	         {
	             return 3;
	         }
	         else
	         {
	              return 2;
	         }
	     }
	     else if(b>a && b>c){
	         if(2*b*b < a*a+b*b+c*c){
	             return 1;
	         }
	         else if(2*b*b > a*a+b*b+c*c){
	             return 3;
	         }
	         else{
	             return 2;
	         }
	     }
	     else if(c>a && c>b){
	         if(2*c*c < a*a+b*b+c*c){
	             return 1;
	         }
	         else if(2*c*c > a*a+b*b+c*c){
	             return 3;
	         }
	         else{
	             return 2;
	         }
	     }
	     else {
	         if(2*c*c < a*a+b*b+c*c){
	              return 1;
	         }
	         else if(2*c*c > a*a+b*b+c*c){
	              return 3;
	         }
	         else{
	              return 2;
	         }
	     }
    }

}

public class WAT 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        a = sc.nextInt();
        b= sc.nextInt();
        c= sc.nextInt();
        Compare Obj = new Compare();
        int result = Obj.triangle(a,b,c);
        System.out.print(result);
    }
}