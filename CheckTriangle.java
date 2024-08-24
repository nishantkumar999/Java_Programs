import java.util.*;
public class CheckTriangle{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //Write your code here
         int a = sc.nextInt();
	     int b = sc.nextInt();
	     int c = sc.nextInt();

        int largeSide;  //Declare a variable.
        
         //Conditional to find large side.
	if(a>=b && a>=c){
	    largeSide=a;
        }
        else if(b>=a&&b>=c){
            largeSide=b;
        }
        else{
            largeSide=c;
        }
 
        //Calculating side for comparsion.
        int lhs = 2*(largeSide*largeSide);
        int rhs = a*a + b*b + c*c;
        
        if(lhs<rhs){
            System.out.println(1);
        }
        else if(lhs==rhs){
            System.out.println(2);
        }
        else{
            System.out.println(3);
        }
          
        
    }
	
}