/* Rectangle Area
Write a program to print the area of a rectangle

Note: You have to print till 4 decimal places.*/


import java.util.*;

public class RAD 
{

    public static void main(String[] strings) 
    {
         
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        double b = sc.nextDouble();

        double area = l*b;
        System.out.printf("%.4f",area);

        
    }
}