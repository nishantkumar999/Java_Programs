/*Write a Java program to print the area and perimeter of a circle.

In geometry, the area enclosed by a circle of radius r is πr2. Here the Greek letter π represents a constant, approximately equal to 3.14159, which is equal to the ratio of the circumference of any circle to its diameter.

The circumference of a circle is the linear distance around its edge.*/


import java.util.*;
 
public class Circler
{
	public static void main (String[] args) throws java.lang.Exception
	{
		 
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double pi = 3.141592653589793238462643;
        double perimeter = 2*pi*r;
        double area = pi*r*r;
     
        System.out.println("Perimeter is = "+perimeter);
        System.out.println("Area is = "+area);
	}
}