/* Area of a Triangle
Your are given height h and base length b of a triangle. Your task is to find and return the area of that triangle with function method creating*/


import java.util.*;

public class  AWF
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double base = sc.nextDouble();
        double solution = triangle_area(height , base);
        System.out.println(solution);
    }

     
    public static double triangle_area(double h, double b)
    {
          
          double area = (h*b)/2;
          return area;
    }

}