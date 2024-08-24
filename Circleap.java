/*You are required to take the radius of a circle as input from the user, and finally, print the area and perimeter of the circle.

Note: Take pi as 3*/

import java.util.*;

public class Circleap
{
     public static void main(String[] args)
     {
          Scanner sc = new Scanner(System.in);
          long r = sc.nextLong();
          long area = 3*r*r;
          long perimeter = 2*3*r;
          
          System.out.println(area);
          System.out.println(perimeter);
     }
}