import java.util.Scanner;

public class TableCount
{
      public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
           
            System.out.print("Please Enter Radius: ");
            double rad = sc.nextDouble();
            
            System.out.print("Please enter value of Pi: "); 
            double pi = sc.nextDouble();
             
            double area =  pi*rad*rad;
            double perimeter = 2*pi*rad; 
            
            System.out.println("Area is = "+area);
            System.out.println("Perimeter is = "+perimeter);
      }     
}